import javax.swing.*;
import java.awt.*;

public class PaintApp extends JFrame {
    public static Canvas canvas = new Canvas();
    public static Sidebar sidebar = new Sidebar();
    public static Topbar topbar = new Topbar();

    public PaintApp() {
        super("Primitive Paint");

        add(topbar, "North");
        add(sidebar, "West");
        add(canvas, "Center");

        this.setSize(800, 539);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("assets/appIcon.png"));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
}
