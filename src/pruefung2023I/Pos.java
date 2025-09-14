package pruefung2023I;

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

    public int hasCode(){
        return x + y * 50;
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
