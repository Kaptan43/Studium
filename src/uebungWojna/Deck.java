package uebungWojna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card> {

    private List<Card> deck = new ArrayList<>(52);

    public Deck() {
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                deck.add(new Card(r, s));
            }
        }
    }

    public int size() {
        return deck.size();
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> draw(int n){
        if(n<0 || n > deck.size()) {
            throw new IllegalArgumentException("");
        }
        int from = deck.size() - n;
        List<Card> taken = new ArrayList<>(deck.subList(from, deck.size()));
        deck.subList(from, deck.size()).clear();

        return taken;
    }

    @Override
    public Iterator<Card> iterator() {
        return Collections.unmodifiableList(deck).iterator();
    }
}
