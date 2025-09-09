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

    public boolean equals(Object o){
        return o.equals(this);
    }

}
