import javax.swing.*;

public class PaintApp extends JFrame {
    public static Canvas canvas = new Canvas();
    public static Sidebar sidebar = new Sidebar();

    public PaintApp() {
        super("Primitive Paint");

        // canvas = new Canvas();
        // sidebar = new Sidebar();

        // add(sidebar, "West");
        add(canvas, "Center");

        add(sidebar, "East");

        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // set default close operation
        this.setLocationRelativeTo(null); // set locating to the middle of the screen
        this.setVisible(true);
        // this.setBackground(Co);
    }
}
