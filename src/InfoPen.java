import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class InfoPen extends InfoTool {
    private int startX, startY, endX, endY;
    private Color colour;
	private int brushWidth;
    
    public InfoPen(int startX, int startY, int endX, int endY, int brushWidth, Color colour) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.brushWidth = brushWidth;
        this.colour = colour;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(colour);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(brushWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        // g2.fill(new Ellipse2D.Double(i[0]-5, i[1]-5, i[5], i[5]));
        graphics.drawLine(startX, startY, endX, endY);
    }
}
