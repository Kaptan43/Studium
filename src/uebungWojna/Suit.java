package uebungWojna;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    public String getSymbol(){
        switch(this){
            case CLUBS -> {return "♣";}
            case DIAMONDS -> {return  "♦";}
            case HEARTS -> {return "♥";}
            case SPADES -> {return "♠";}
            default -> {throw new IllegalArgumentException("Fehler");}
        }
    }

    @Override
    public String toString(){
        return this.getSymbol();
    }

}
