package pruefung2023I;

import java.util.Objects;

public class Pos {

    private final int x;
    private final int y;

    public Pos(){
        this(0,0);
    }

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Pos)){
            return false;
        }
        Pos pos = (Pos) o;
        return this.x == pos.x && this.y == pos.y;
    }

}
