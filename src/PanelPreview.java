import java.awt.*;
import javax.swing.*;

public class PanelPreview extends JPanel {
    public PanelPreview() {
        this.setPreferredSize(new Dimension(34, 34));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int s = PanelTopbar.thicknessValue;

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(PanelSidebar.currentColor);

        g.fillRect(17-s/2, 17-s/2, s, s);
    }
}
