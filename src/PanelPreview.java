import java.awt.*;
import javax.swing.*;

public class PanelPreview extends JPanel {
    public PanelPreview() {
        this.setPreferredSize(new Dimension(34, 34));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Crosshair (better show transparency)
        g2d.drawLine(17, 1, 17, 14);
        g2d.drawLine(1, 17, 14, 17);
        g2d.drawLine(17, 20, 17, 34);
        g2d.drawLine(20, 17, 34, 17);

        // Drawing the pen stroke
        g2d.setStroke(new BasicStroke(PanelTopbar.thicknessValue, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(PanelSidebar.currentColor);
        g2d.drawLine(17, 17, 17, 17);
    }
}
