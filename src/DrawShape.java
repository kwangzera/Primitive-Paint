import java.awt.*;

public class DrawShape extends DrawTool {
    protected int startX, startY, width, height;
    protected Color color;
    protected int brushWidth;
    protected boolean filled;

    // Constructor including the start points, end point, brush width, brush height, or if the shape is filled
    public DrawShape(int startX, int startY, int width, int height, int brushWidth, Color color, Boolean filled) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.brushWidth = brushWidth;
        this.color = color;
        this.filled = filled;
    }
}
