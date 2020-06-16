import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Pen extends Tool implements Mouse {
    // private Pen pen1 = new Pen(this);
    // private Eraser eraser1 = new Eraser(this);
    // private Tool currentTool = pen1;
    // protected Color currColour;
    public int x1 = -10, y1 = -10;
    public int x2 = -10, y2 = -10;

    // not needed tbh but keeping it for now as reference
    public Pen() {

    }

    public void mouseDrag(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        strokes.add(new InfoPen(x1, y1, x2, y2, Topbar.thicknessValue, fetchColor()));
        x1 = x2;
        y1 = y2;
        System.out.println(x2 + ", " + y2);
    }
    
    public void mouseUp(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        x1 = x2;
        y1 = y2;
        strokes.add(new InfoPen(x2, y2, x2, y2, Topbar.thicknessValue, fetchColor()));
    }

    public void mouseDown(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        strokes.add(new InfoPen(x2, y2, x2, y2, Topbar.thicknessValue, fetchColor()));
    }
    public Color fetchColor() {
        return Sidebar.currentColor;
    }
}
