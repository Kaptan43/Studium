package pruefung2025I;

import java.util.HashMap;
import java.util.Map;

public class PairOfDice implements Comparable<PairOfDice> {

    private Die die1;
    private Die die2;

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

    public boolean isPasch(PairOfDice pair){
        if (pair.die1 == pair.die2){
            return true;
        }
        return false;
    }

    public boolean isMaerchen(PairOfDice pair){
        int a = diceToMap().get(Die.ONE);
        int b = diceToMap().get(Die.TWO);

        if(a+b == 3){
            return true;
        }
        return false;
    }

    public Map<Die, Integer> diceToMap(){

        Map<Die, Integer> dice = new HashMap<>();

        if (isPasch(this)) {
            dice.put(Die.ONE, 1);
            dice.put(Die.TWO, 2);
            dice.put(Die.THREE, 3);
            dice.put(Die.FOUR, 4);
            dice.put(Die.FIVE, 5);
            dice.put(Die.SIX, 6);
        }
        if(isMaerchen(this)){
            dice.put(Die, 7);
        }
        return dice;
    }

    @Override
    public int compareTo(PairOfDice other) {
        PairOfDice p = new PairOfDice(die1, die2);

        if(p.compareTo(other) < 0){
            return -1;
        }
        if(p.compareTo(other) > 0) {
            return 1;
        }
        if(p.compareTo(other) == 0) {
            return 0;
        }
        throw new IllegalArgumentException("Vergleich nicht möglich!");
    }

}
