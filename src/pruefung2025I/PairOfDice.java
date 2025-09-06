package pruefung2025I;


public class PairOfDice implements Comparable<PairOfDice> {


    private final Die die1;
    private final Die die2;

    public  PairOfDice(Die die1, Die die2){
        this.die1 = die1;
        this.die2 = die2;
    }

    public Die getDie1(){
        return die1;
    }

    public Die getDie2(){
        return die2;
    }


    public static PairOfDice random(){
        return new PairOfDice(Die.random(), Die.random());

    }

    private static int wertToInt(Die die){
        switch(die){
            case ONE -> {return 1;}
            case TWO -> {return 2;}
            case THREE -> {return 3;}
            case FOUR -> {return 4;}
            case FIVE -> {return 5;}
            case SIX -> {return 6;}
            default -> throw new IllegalArgumentException("Kein gültiger Wert!");
        }
    }

    private static int[] hiLo(int hi, int lo){
        if(hi >= lo){
            return new int[]{hi, lo};
        }
        else {
            return new int[]{lo, hi};
        }
    }

    public boolean isPasch(){
        if (die1 == die2){
            return true;
        }
        return false;
    }

    public boolean isMaerchen(){
        int a = wertToInt(die1);
        int b = wertToInt(die2);

        int[] hl = hiLo(a, b);

        if( hl[0] == 2 && hl[1] == 1 ){
            return true;
        }

        return false;
    }

    private int rank(){
        int a = wertToInt(die1);
        int b = wertToInt(die2);
        int[] hl = hiLo(a, b);
        int higher = hl[0];
        int lower = hl[1];

        if( isMaerchen()){
            return 100;
        }
        if (isPasch()){
            return 90 + a;
        }
        return higher*10 + lower;
    }


    @Override
    public int compareTo(PairOfDice other) {
        if( this.rank() < other.rank() ){
            return -1;
        }
        else if( this.rank() > other.rank() ){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "(" + wertToInt(die1) + "," + wertToInt(die2) + ")";
    }

}

class Testen{
    public static void main(String[] args) {
        PairOfDice maerchen = new PairOfDice(Die.TWO, Die.ONE);
        PairOfDice pasch66 = new PairOfDice(Die.SIX, Die.SIX);
        PairOfDice normal65 = new PairOfDice(Die.SIX, Die.FIVE);
        PairOfDice normal13 = new PairOfDice(Die.ONE, Die.THREE);
        PairOfDice normal56 = new PairOfDice(Die.FIVE, Die.SIX);

        System.out.println();

        System.out.println("Märchen: " + maerchen);
        System.out.println("66: " + pasch66);
        System.out.println("65: " + normal65);
        System.out.println("13: " + normal13);
        System.out.println("56: " + normal56);

        System.out.println();

        System.out.println("21 vs 66: " + maerchen.compareTo(pasch66));
        System.out.println("21 vs 65: " + maerchen.compareTo(normal65));
        System.out.println("21 vs 13: " + maerchen.compareTo(normal13));
        System.out.println("13 vs 65: " + normal13.compareTo(normal65));
        System.out.println("13 vs 13: " + normal13.compareTo(normal13));
        System.out.println("56 vs 65: " + normal56.compareTo(normal65));
    }

}