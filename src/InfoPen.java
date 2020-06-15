import java.awt.Graphics;
import java.util.ArrayList;

public class InfoPen extends InfoTool {
    int startX, startY, endX, endY;
    
    public InfoPen(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;


        
    }

    public void draw(Graphics graphics) {
        // g2.fill(new Ellipse2D.Double(i[0]-5, i[1]-5, i[5], i[5]));
        graphics.drawLine(startX, startY, endX, endY);
    }
}