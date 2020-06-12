import java.awt.*;


public class Eraser extends Pen {
    public Eraser(MyPanel panel) {
        super(panel);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(panel.getMouseX(), panel.getMouseY(), 10, 10);
        // g.fillOval(100, 100, 10, 10);
        // g.drawImage(MyPanel.paintImage, 0, 0, null);
    }
}
