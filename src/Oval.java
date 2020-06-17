public class Oval extends Shape {
    public InfoShape addShape() {
        alignDrag();
        return new InfoOval(newX, newY, width, height, Topbar.thicknessValue, Sidebar.currentColor, Sidebar.filled);
    }
}
