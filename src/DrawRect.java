import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class DrawRect extends DrawShape {
    public DrawRect(int startX, int startY, int width, int height, int brushWidth, Color colour, Boolean filled) {
        super(startX, startY, width, height, brushWidth, colour, filled);
    }

    public void draw(Graphics graphics) {
        graphics.setColor(colour);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(brushWidth));

        if (filled)
            graphics.fillRect(startX, startY, width, height);
        else
            graphics.drawRect(startX, startY, width, height);
    }
}
