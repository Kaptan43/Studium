package pruefung2025I;

import java.util.concurrent.ThreadLocalRandom;

public enum Die {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX;

    public static Die random(){
        Die[] values = Die.values();
        int index = ThreadLocalRandom.current().nextInt(values.length);
        return values[index];
    }

}
