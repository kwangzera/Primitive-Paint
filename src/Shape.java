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
        this.x2 = event.getX();
        this.y2 = event.getY();

        strokes.set(strokes.size()-1, addShape(x1, y1, x2, y2));

    }

    public void mouseUp(ArrayList<InfoTool> strokes, MouseEvent event) {

    }

    public void mouseDown(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();

        strokes.add(addShape(x1, y1, x2, y2));
    }

    public Color fetchColor() {
        return Sidebar.currentColor;
    }

    public InfoShape addShape(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2-x1), height = Math.abs(y2-y1);
        int newX = x1, newY = y1;


        // Pointing southeast (default)

        // Pointing southwest
        if (x2 < x1 && y2 > y1) {
            newX = x2;

        // Pointing northeast
        } if (x2 >= x1 && y2 <= y1) {
            newY = y2;

        // Pointing northwest
        } if (x2 < x1 && y2 < y1) {
            newX = x2;
            newY = y2;
        }
        
        return new InfoShape(newX, newY, width, height, Topbar.thicknessValue, Sidebar.currentColor);
    }
}
