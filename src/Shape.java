import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Shape extends Tool implements Mouse {
    public int x1 = -10, y1 = -10;
    public int x2 = -10, y2 = -10;

    public Shape() {

    }

    public void mouseDrag(ArrayList<InfoTool> strokes, MouseEvent event) {

    }

    public void mouseUp(ArrayList<InfoTool> strokes, MouseEvent event) {

    }

    public void mouseDown(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        strokes.add(new InfoShape(x2, y2, x2, y2, Topbar.thicknessValue, fetchColor()));
    }

    public Color fetchColor() {
        return Sidebar.currentColor;
    }

    public InfoShape addShape() {

    }
}
