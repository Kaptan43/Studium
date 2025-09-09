package pruefung2023I;

public class Circle implements Shape {

    private int radius;
    private Pos center;

    public Circle(Pos center, int radius){
        this.center = center;
        if(radius < 0){
            throw new IllegalArgumentException("radius can't be negative");
        }
        this.radius = radius;
    }

    public Circle(){
        center = new Pos();
        radius = 0;
    }

    public int getRadius(){
        return radius;
    }

    public Pos getCenter(){
        return center;
    }

    public void setRadius(int radius){
        if(radius < 0){
            throw new IllegalArgumentException("radius can't be negative");
        }
        this.radius = radius;
    }

    public void setCenter(Pos center){
        this.center = center;
    }

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
