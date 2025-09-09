package pruefung2023I.aufgabe5;

import pruefung2023I.Pos;
import pruefung2023I.Rectangle;

public class DrawRectangle {
    final WaitForClick waitForClick = new WaitForClick(this);
    final Dragging dragging = new Dragging(this);
    private final Rectangle rect = new Rectangle();
    private DrawRectangle_Sate state = waitForClick;

    void setState(DrawRectangle_Sate s){
        state = s;
    }

    public Rectangle getRectangle(){
        return rect;
    }

    public void mouseDown(Pos p){
        state.mouseDown(p);
    }

    public void mouseUp(Pos p){
        state.mouseUp(p);
    }

    public void mouseMove(Pos p){
        state.mouseMove(p);
    }


}
