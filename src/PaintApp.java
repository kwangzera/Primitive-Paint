import javax.swing.*;

public class PaintApp extends JFrame {
    public static Canvas canvas = new Canvas();
    public static Sidebar sidebar = new Sidebar();
    public static Topbar topbar = new Topbar();

    public PaintApp() {
        super("Primitive Paint");

        // Adding each separate component into the main JFrame
        add(topbar, "North");
        add(sidebar, "West");
        add(canvas, "Center");

        this.setSize(800, 539);
        this.setLocationRelativeTo(null);  // Center of the screen when opened
        this.setResizable(false);  // Unresizable window
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
