import java.awt.event.MouseEvent;

public class CreateLine extends CreateTool {
    public int x1 = -1, y1 = -1;
    public int x2 = -1, y2 = -1;

    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        PanelCanvas.shapes.set(PanelCanvas.shapes.size()-1, new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, PanelSidebar.currentColor));
    }
    
    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        
        PanelCanvas.shapes.add(new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, PanelSidebar.currentColor));
    }

    public void mouseReleased(MouseEvent event) {

    }
}
