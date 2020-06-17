import javax.swing.*;

public class FramePaintApp extends JFrame {
    public static PanelCanvas canvas = new PanelCanvas();
    public static PanelSidebar sidebar = new PanelSidebar();
    public static PanelTopbar topbar = new PanelTopbar();

    public FramePaintApp() {
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
