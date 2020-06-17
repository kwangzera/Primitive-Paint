import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;


public class InfoOval extends InfoShape {

    public InfoOval(int startX, int startY, int width, int height, int brushWidth, Color colour, Boolean filled) {
        super(startX, startY, width, height, brushWidth, colour, filled);

    }

    public void draw(Graphics graphics) {
        graphics.setColor(colour);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(brushWidth));

        if (filled)
            graphics.fillOval(startX, startY, width, height);
        else
            graphics.drawOval(startX, startY, width, height);
    }
}
