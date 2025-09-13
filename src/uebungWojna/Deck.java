package uebungWojna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card> {

    private List<Card> cards = new ArrayList<>(52);

    public Deck() {
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> draw(int n){
        if(n<0 || n > cards.size()) {
            throw new IllegalArgumentException("");
        }
        int from = cards.size() - n;
        List<Card> taken = new ArrayList<>(cards.subList(from, cards.size()));
        cards.subList(from, cards.size()).clear();

        return taken;
    }

    @Override
    public Iterator<Card> iterator() {
        return Collections.unmodifiableList(cards).iterator();
    }
}
