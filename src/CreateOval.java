public class CreateOval extends CreateShape {
    public DrawShape addShape() {
        alignDrag();
        return new DrawOval(newX, newY, width, height, PanelTopbar.thicknessValue, PanelSidebar.currentColor, PanelSidebar.filled);
    }
}
