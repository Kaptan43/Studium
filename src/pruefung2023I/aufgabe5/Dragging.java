package pruefung2023I.aufgabe5;

import pruefung2023I.Pos;

public class Dragging implements DrawRectangle_Sate {

    private DrawRectangle drawRectangle;

    public Dragging(DrawRectangle drawRectangle){
        this.drawRectangle = drawRectangle;
    }

    @Override
    public void mouseUp(Pos p) {
        drawRectangle.getRectangle().setB(p);

        drawRectangle.setState(drawRectangle.waitForClick);
    }

    @Override
    public void mouseDown(Pos p) {
        throw new RuntimeException("Nicht erlaubt!");
    }

    @Override
    public void mouseMove(Pos p) {
        drawRectangle.getRectangle().setB(p);

    }
}
