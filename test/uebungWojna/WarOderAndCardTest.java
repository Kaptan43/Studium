package uebungWojna;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class WarOderAndCardTest {

    private List<Card> fullDeck() {
        List<Card> deck = new ArrayList<>();
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                deck.add(new Card(r, s));
            }
        }
        return deck;
    }

    @Test
    void shuffleAndSort_sortsByRankOnly_andGroupsAllSuits() {
        List<Card> deck = fullDeck();

        // deterministisches Mischen
        Collections.shuffle(deck, new Random(42));

        // sortieren mit deinem Comparator (ignoriert Suit)
        deck.sort(new WarOder());

        // Erwartung: 13 Blöcke á 4 Karten, jeweils gleicher Rank, alle 4 Suits vorhanden
        int i = 0;
        for (Rank expected : Rank.values()) {
            EnumSet<Suit> seen = EnumSet.noneOf(Suit.class);
            for (int k = 0; k < 4; k++) {
                Card c = deck.get(i++);
                assertEquals("Rank-Reihenfolge verletzt", expected, c.getRank());
                seen.add(c.getSuit());
            }
            assertEquals("Nicht alle Suits in Rank-Gruppe " + expected, EnumSet.allOf(Suit.class), seen);
        }
        assertEquals(52, i);
    }

    @Test
    void comparator_returnsZero_forSameRankDifferentSuit() {
        Card a = new Card(Rank.TEN, Suit.HEARTS);
        Card b = new Card(Rank.TEN, Suit.SPADES);
        assertEquals(0, new WarOder().compare(a, b));
        assertEquals(0, new WarOder().compare(b, a));
    }

    @Test
    void equalsAndHashCode_equalObjectsHaveSameHash() {
        Card c1 = new Card(Rank.ACE, Suit.SPADES);
        Card c2 = new Card(Rank.ACE, Suit.SPADES);

        // equals-Vertrag: reflexiv, symmetrisch, konsistent, null-sicher
        assertTrue(c1.equals(c1), "Reflexivität verletzt");
        assertTrue(c1.equals(c2) && c2.equals(c1), "Symmetrie verletzt");
        assertFalse(c1.equals(null), "Vergleich mit null muss false sein");

        // Konsistenz equals/hashCode: gleiche Objekte -> gleicher Hash
        assertEquals(String.valueOf(c1.hashCode()), c2.hashCode(), "Gleiche Karten müssen gleichen Hashcode haben");
    }

    @Test
    void equals_negativeForDifferentSuitOrRank() {
        Card aceSpades   = new Card(Rank.ACE, Suit.SPADES);
        Card aceHearts   = new Card(Rank.ACE, Suit.HEARTS);
        Card kingSpades  = new Card(Rank.KING, Suit.SPADES);

        assertNotEquals(aceSpades, aceHearts, "Gleicher Rank, anderer Suit -> ungleich");
        assertNotEquals(aceSpades, kingSpades, "Anderer Rank -> ungleich");
    }

    @Test
    void comparatorNotConsistentWithEquals_isExpectedHere() {
        // Demonstriert, dass der Comparator bewusst nicht mit equals konsistent ist:
        Card x = new Card(Rank.JACK, Suit.CLUBS);
        Card y = new Card(Rank.JACK, Suit.DIAMONDS);

        assertNotEquals(x, y);                  // equals bezieht Suit ein
        assertEquals(0, new WarOder().compare(x, y)); // Comparator ignoriert Suit
    }
}
