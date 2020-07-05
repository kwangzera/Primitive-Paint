import java.awt.*;
import javax.swing.*;

public class PanelBottombar extends JPanel {
    public static JLabel mouse, canvas;
    public static JLabel currTool;

    public static int mouseX = -1, mouseY = -1;
    public static int canvasX = -1, canvasY = -1;
    public static String cTool = "Pen";
    public static int sWidth = 12;
    public static String sColor = "#FFFFFF";

    public PanelBottombar() {
        super(new GridLayout());

        JPanel mouseLabel = new JPanel();
        JPanel canvasLabel = new JPanel();
        JPanel currToolLabel = new JPanel();

        // Adding things in for the mouseLabel
        mouse = new JLabel("Position: 0px, 0px");
        mouseLabel.setAlignmentX(CENTER_ALIGNMENT);
        mouseLabel.add(new JLabel(new ImageIcon("assets/bottombar/cursor.png")));
        mouseLabel.add(mouse);
        // mouseLabel.setBorder(BorderFactory.createCompoundBorder(
        //     BorderFactory.createMatteBorder(0, 1, 0, 0, new Color(166, 166, 166)),
        //     BorderFactory.createMatteBorder(0, 1, 0, 0, Color.WHITE)
        // ));

        // Adding things in for the canvasLabel
        canvas = new JLabel("Canvas: 0px by 0px");
        canvasLabel.setAlignmentX(CENTER_ALIGNMENT);
        canvasLabel.add(new JLabel(new ImageIcon("assets/bottombar/canvas.png")));
        canvasLabel.add(canvas);
        // canvasLabel.setBorder(BorderFactory.createCompoundBorder(
        //     BorderFactory.createMatteBorder(0, 1, 0, 0, new Color(166, 166, 166)),
        //     BorderFactory.createMatteBorder(0, 1, 0, 0, Color.WHITE)
        // ));

        // Adding things in for the currToolLabel
        currTool = new JLabel("Stroke: 12px, #FF000000");

        currToolLabel.add(new JLabel(new ImageIcon("assets/bottombar/stroke.png")));
        currToolLabel.add(currTool);
        // currToolLabel.setBorder(BorderFactory.createCompoundBorder(
        //     BorderFactory.createMatteBorder(0, 1, 0, 0, new Color(166, 166, 166)),
        //     BorderFactory.createMatteBorder(0, 1, 0, 0, Color.WHITE)
        // ));

        this.add(mouseLabel);
        this.add(canvasLabel);
        this.add(currToolLabel);
    }
}
