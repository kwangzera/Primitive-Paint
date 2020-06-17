import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class InfoShape extends InfoTool {
    protected int startX, startY, width, height;
    protected Color colour;
    protected int brushWidth;
    protected boolean filled;
    
    // put this in infotool?
    public InfoShape(int startX, int startY, int width, int height, int brushWidth, Color colour, Boolean filled) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.brushWidth = brushWidth;
        this.colour = colour;
        this.filled = filled;
    }
}
