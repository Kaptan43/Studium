package uebungWojna;

import java.util.*;

public final class Pile implements Iterable<Card> {
    private final ArrayDeque<Card> pile = new ArrayDeque<>();

    public Card drawTop(){
        if(pile.isEmpty() || pile == null){
            throw new NoSuchElementException("Pile is empty");
        }
        return pile.removeFirst();
    }

    public void addBottom(List<Card> won){
        for (Card card : won){
            pile.addLast(card);
        }
    }

    public int size(){
        return pile.size();
    }

    public boolean isEmpty(){
        return pile.isEmpty();
    }

    @Override
    public Iterator<Card> iterator() {
        return Collections.unmodifiableCollection(pile).iterator();
    }
}
