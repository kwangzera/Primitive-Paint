import java.awt.event.MouseEvent;

public class CreateLine extends CreateTool {
    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        // Replaces the placeholder with a line, with the placeholder's original x1 and y1 position
        PanelCanvas.shapes.set(PanelCanvas.shapes.size()-1, new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, PanelSidebar.currentColor));
    }
    
    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        
        // Creates a dot as a placeholder
        PanelCanvas.shapes.add(new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, PanelSidebar.currentColor));
    }

    public void mouseReleased(MouseEvent event) {

    }
}
