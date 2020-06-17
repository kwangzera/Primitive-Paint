import java.awt.*;
import java.awt.event.MouseEvent;

public class CreateShape extends CreateTool {
    protected int x1 = -1, y1 = -1;
    protected int x2 = -1, y2 = -1;
    protected int width = 0, height = 0;
    protected int newX = 0, newY = 0;

    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        // Keep on replacing the last ArrayList value, shape changes sizes when repaint() called
        PanelCanvas.shapes.set(PanelCanvas.shapes.size()-1, addShape());

    }

    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();

        // Adding a placeholder value, prevent unwanted square on click
        PanelCanvas.shapes.add(new DrawTool());
    }

    public void mouseReleased(MouseEvent event) {

    }

    public Color fetchColor() {
        return PanelSidebar.currentColor;
    }

    public DrawShape addShape() {
        alignDrag();
        return new DrawShape(newX, newY, width, height, PanelTopbar.thicknessValue, PanelSidebar.currentColor, PanelSidebar.filled);

    }

    // The width and height of the shape is created using the start and end points
    // Mouse dragging is also taken into account
    public void alignDrag() {
        width = Math.abs(x2-x1);
        height = Math.abs(y2-y1);
        newX = x1;
        newY = y1;

        // P2 Pointing southwest of P1
        if (x2 < x1 && y2 > y1) {
            newX = x2;

        // P2 Pointing northeast of P1
        } if (x2 > x1 && y2 < y1) {
            newY = y2;

        // P2 Pointing northwest of P1
        } if (x2 <= x1 && y2 <= y1) {
            newX = x2;
            newY = y2;
        }
    }
}
