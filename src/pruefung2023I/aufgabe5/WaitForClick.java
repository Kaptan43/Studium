package pruefung2023I.aufgabe5;

import pruefung2023I.Pos;
import pruefung2023I.Rectangle;

public class WaitForClick implements DrawRectangle_Sate {

    private final DrawRectangle drawRectangle;

    public WaitForClick(DrawRectangle drawRectangle) {
        this.drawRectangle = drawRectangle;
    }

    @Override
    public void mouseUp(Pos p) {
        throw new RuntimeException("Nicht erlaubt!");
    }

    @Override
    public void mouseDown(Pos p) {
        drawRectangle.getRectangle().setA(p);

        drawRectangle.setState(drawRectangle.dragging);
    }

    @Override
    public void mouseMove(Pos p) {

    }
}
