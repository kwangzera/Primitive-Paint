import java.awt.event.MouseEvent;

public class CreateLine extends CreateTool {
    public int x1 = -10, y1 = -10;
    public int x2 = 0, y2 = 0;

    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        PanelCanvas.shapes.set(PanelCanvas.shapes.size()-1, new DrawPen(x1, y1, x2, y2, PanelTopbar.thicknessValue, PanelSidebar.currentColor));
    }
    
    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        PanelCanvas.shapes.add(new DrawPen(x1, y1, x2, y2, PanelTopbar.thicknessValue, PanelSidebar.currentColor));
    }

    public void mouseReleased(MouseEvent event) {

    }
}
