package pruefung2025I;

import java.util.HashMap;
import java.util.Map;

public class PairOfDice1 implements Comparable<PairOfDice1>{

    private Die die1;
    private Die die2;

    private Map<Die, Integer> diceMap = new HashMap<>();

    public PairOfDice1(Die die1, Die die2){
        this.die1 = die1;
        this.die2 = die2;

        diceMap.put(Die.ONE, 1);
        diceMap.put(Die.TWO, 2);
        diceMap.put(Die.THREE, 3);
        diceMap.put(Die.FOUR, 4);
        diceMap.put(Die.FIVE, 5);
        diceMap.put(Die.SIX, 6);

    }

    public static PairOfDice1 random(){
        return new PairOfDice1(Die.random(), Die.random());
    }

    class HiLo{
        Die flagHi = die1;
        Die flagLo = die2;

        HiLo(Die value1, Die value2){
            if(diceMap.get(value1) < diceMap.get(value2)) {
                flagHi = value1;
                flagLo = value2;
            }
            else {
                flagHi = value2;
                flagLo = value1;
            }
        }

        Die getFlagHi(PairOfDice1 p){
            return flagHi;
        }

        Die getFlagLo(PairOfDice1 p){
            return flagLo;
        }

        int getFlagHiAsInt(){
            return diceMap.get(flagHi);
        }

        int getFlagLoAsInt(){
            return diceMap.get(flagLo);
        }

    }

    @Override
    public int compareTo(PairOfDice1 other) {
        HiLo val1 = new HiLo(die1, die2);
        HiLo val2 = new HiLo(other.die1, other.die2);

        if(val1.getFlagHiAsInt() == val2.getFlagHiAsInt() && val2.getFlagLoAsInt() == val1.getFlagLoAsInt()) {

        }

        if(val1.getFlagHiAsInt() < val2.getFlagHiAsInt()){
            return -1;
        }
        else if(val1.getFlagHiAsInt() == val2.getFlagHiAsInt()){
            if(val1.getFlagLoAsInt() < val2.getFlagLoAsInt()){
                return -1;
            }
        }
        else if(val1.getFlagHiAsInt() > val2.getFlagHiAsInt()){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        PairOfDice1 pairOfDice1 = new PairOfDice1(Die.ONE, Die.SIX);

        Die d1 = pairOfDice1.die1;
        Die d2 = pairOfDice1.die2;

    }


}
