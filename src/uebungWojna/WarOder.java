package uebungWojna;

import java.util.Comparator;
import java.util.Objects;

public class WarOder implements Comparator<Card> {

    @Override
    public int compare(Card a, Card b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        return a.getRank().compareTo(b.getRank());
    }

//    @Override
//    public int compare(Card o1, Card o2) {
//        if(o1.rankToInt(o1.getRank()) < o2.rankToInt(o2.getRank())){
//            return -1;
//        }
//        else if(o1.rankToInt(o1.getRank()) > o2.rankToInt(o2.getRank())){
//        return 1;
//        }
//        return 0;
//    }
}
