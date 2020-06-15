import java.util.ArrayList;

import java.awt.event.*;
import java.awt.*;

public class Eraser extends Pen {
    public Eraser() {
        super();
    }

    // @Override
    public void mouseDrag(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        strokes.add(new InfoPen(x1, y1, x2, y2, Topbar.thicknessValue, Color.WHITE));
        x1 = x2;
        y1 = y2;
        System.out.println(x2 + ", " + y2);
    }

}