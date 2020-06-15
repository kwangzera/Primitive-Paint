import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class InfoPen extends InfoTool {
    int startX, startY, endX, endY, brushWidth;
    
    public InfoPen(int startX, int startY, int endX, int endY, int brushWidth) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.brushWidth = brushWidth;
    }

    public void draw(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(brushWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        // g2.fill(new Ellipse2D.Double(i[0]-5, i[1]-5, i[5], i[5]));
        graphics.drawLine(startX, startY, endX, endY);
    }
}