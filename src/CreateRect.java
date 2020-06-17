public class CreateRect extends CreateShape {
    public DrawShape addShape() {
        alignDrag();
        return new DrawRect(newX, newY, width, height, PanelTopbar.thicknessValue, PanelSidebar.currentColor, PanelSidebar.filled);
    }
}
