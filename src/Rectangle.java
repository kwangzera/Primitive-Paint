public class Rectangle extends Shape {
    public InfoShape addShape() {
        alignDrag();
        return new InfoRect(newX, newY, width, height, Topbar.thicknessValue, Sidebar.currentColor, Sidebar.filled);
    }
}
