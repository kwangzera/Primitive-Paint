import java.awt.*;

public class Pen extends Tool {
    public Pen(MyPanel panel) {
        super(panel);
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        // System.out.println(panel.getMouseX() + " " + panel.getMouseY());
        g.fillOval(panel.getMouseX(), panel.getMouseY(), 10, 10);
		g.fillOval(100, 100, 10, 10);
		// g.drawImage(MyPanel.paintImage, 0, 0, null);
    }
}
