import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class InfoShape extends InfoTool {
    protected int startX, startY, width, height;
    protected Color colour;
    protected int brushWidth;
    
    // put this in infotool?
    public InfoShape(int startX, int startY, int width, int height, int brushWidth, Color colour) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.brushWidth = brushWidth;
        this.colour = colour;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(colour);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(brushWidth));

        graphics.drawRect(startX, startY, width, height);
    }
}