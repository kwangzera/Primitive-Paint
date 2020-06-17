import java.awt.*;
import java.awt.event.*;

public class CreatePen extends CreateTool {
    public int x1 = -10, y1 = -10;
    public int x2 = -10, y2 = -10;

    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        PanelCanvas.shapes.add(new DrawPen(x1, y1, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
        x1 = x2;
        y1 = y2;
        System.out.println(x2 + ", " + y2);
    }
    
    public void mousePressed(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        x1 = x2;
        y1 = y2;
        PanelCanvas.shapes.add(new DrawPen(x2, y2, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
    }

    public void mouseReleased(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        PanelCanvas.shapes.add(new DrawPen(x2, y2, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
    }

    // Separate method created to set a temporary colour (used in CreateEraser.java)
    public Color fetchColor() {
        return PanelSidebar.currentColor;
    }
}
