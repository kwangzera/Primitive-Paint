import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class InfoShape extends InfoTool {
    private int startX, startY, endX, endY;
    private Color colour;
    private int brushWidth;
    
    // put this in infotool?
    public InfoShape(int startX, int startY, int endX, int endY, int brushWidth, Color colour) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.brushWidth = brushWidth;
        this.colour = colour;
    }

    public void draw(Graphics graphics) {

    }
}