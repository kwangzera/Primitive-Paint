import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Shape extends Tool {
    protected int x1 = -10, y1 = -10;
    protected int x2 = -10, y2 = -10;
    protected int width = 0, height = 0;
    protected int newX = 0, newY = 0;

    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        Canvas.shapes.set(Canvas.shapes.size()-1, addShape());

    }

    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();

        // Adding a placeholder value
        Canvas.shapes.add(new InfoTool());
    }

    public void mouseReleased(MouseEvent event) {

    }

    public Color fetchColor() {
        return Sidebar.currentColor;
    }

    public InfoShape addShape() {
        alignDrag();
        return new InfoShape(newX, newY, width, height, Topbar.thicknessValue, Sidebar.currentColor, Sidebar.filled);

    }

    public void alignDrag() {
        width = Math.abs(x2-x1);
        height = Math.abs(y2-y1);
        newX = x1;
        newY = y1;

        // Pointing southwest
        if (x2 < x1 && y2 > y1) {
            newX = x2;

        // Pointing northeast
        } if (x2 > x1 && y2 < y1) {
            newY = y2;

        // Pointing northwest
        } if (x2 <= x1 && y2 <= y1) {
            newX = x2;
            newY = y2;
        }
    }
}
