import javax.swing.*;
import java.awt.*;

public class PaintApp extends JFrame {
    public static Canvas canvas = new Canvas();
    public static Sidebar sidebar = new Sidebar();
    public static Topbar topbar = new Topbar();

    public PaintApp() {
        super("Primitive Paint");

        // JPanel fin = new JPanel()
        // canvas = new Canvas();
        // sidebar = new Sidebar();
        // JPanel temp = new JPanel(new BorderLayout());
        // add(sidebar, "West");
        
        add(topbar, "North");
        add(sidebar, "West");
        add(canvas, "Center");
        // System.out.println(topbar.getHeight());
        this.setSize(800, 600);
        System.out.println(topbar.getHeight());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // set default close operation
        this.setLocationRelativeTo(null); // set locating to the middle of the screen
        this.setVisible(true);
        // this.setBackground(Co);
    }
}
