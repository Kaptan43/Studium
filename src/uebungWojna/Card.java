package uebungWojna;

import java.util.Objects;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException("Rank or Suit is null");
        }
        this.rank = rank;
        this.suit = suit;
    }

    public int rankToInt(Rank rank){
        switch (rank){
            case TWO -> {return 2;}
            case THREE -> {return 3;}
            case FOUR -> {return 4;}
            case FIVE -> {return 5;}
            case SIX -> {return 6;}
            case SEVEN -> {return 7;}
            case EIGHT -> {return 8;}
            case NINE -> {return 9;}
            case TEN -> {return 10;}
            case JACK -> {return 11;}
            case QUEEN -> {return 12;}
            case KING -> {return 13;}
            case  ACE -> {return 14;}
            default -> {
                throw new NullPointerException("Rank is null");
            }
        }
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        //Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }


    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return rank.toString() + suit.toString();
    }

    public static void main(String[] args) {

    }

}
