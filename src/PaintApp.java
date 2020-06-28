import java.awt.*;
import javax.swing.*;

public class PaintApp extends JFrame {
    public static JPanel newCanvas = new JPanel(new BorderLayout());
    public static PanelCanvas canvas = new PanelCanvas();
    public static PanelSidebar sidebar = new PanelSidebar();
    public static PanelTopbar topbar = new PanelTopbar();
    public static PanelBottombar bottombar = new PanelBottombar();

    // Canvas width and height for the bottombar
    public static int canvasWidth = canvas.getWidth();
    public static int canvasHeight = canvas.getHeight();

    public PaintApp() {
        super("Primitive Paint");

        // Created a new JPanel to format the bottombar
        newCanvas.add(canvas, BorderLayout.CENTER);
        newCanvas.add(bottombar, BorderLayout.SOUTH);

        // Adding each separate component into the main JFrame
        this.add(topbar, "North");
        this.add(sidebar, "West");
        this.add(newCanvas, "Center");

        this.setSize(800, 539);
        this.setLocationRelativeTo(null);  // Center of the screen when opened
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Setting canvas width and height after placing it down
        PanelBottombar.canvas.setText(String.format("Canvas: %spx by %spx", canvas.getWidth(), canvas.getHeight()));
    }
}
