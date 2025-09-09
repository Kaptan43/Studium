package pruefung2023I;

public class PrintVisitor implements Visitor{

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Circle centered at " + circle.getCenter() + " with radius " + circle.getRadius());
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Rectangle from " + rectangle.getA() + " to " + rectangle.getB());
    }

}
