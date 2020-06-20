import java.awt.*;
import java.awt.event.*;

public class CreatePen extends CreateTool {
    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        PanelCanvas.shapes.add(new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, fetchColor()));

        // Setting the current coordinates to previous coordinates
        x1 = x2;
        y1 = y2;
    }
    
    public void mousePressed(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        // Setting the current coordinates to previous coordinates
        x1 = x2;
        y1 = y2;

        // Draws a dot in the beginning
        // Same coordinates also prevents connection to previously drawn line
        PanelCanvas.shapes.add(new DrawLine(x2, y2, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
    }

    public void mouseReleased(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        PanelCanvas.shapes.add(new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
    }

    // Separate method created to set a temporary color (used in CreateEraser.java)
    public Color fetchColor() {
        return PanelSidebar.currentColor;
    }
}
