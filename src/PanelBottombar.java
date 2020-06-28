import java.awt.*;
import java.awt.event.*;
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

        mouse = new JLabel("Mouse: 100px, 100px");
        mouse.setHorizontalAlignment(JLabel.CENTER);
        canvas = new JLabel("Canvas: 800px by 600px");
        canvas.setHorizontalAlignment(JLabel.CENTER);
        currTool = new JLabel("Draw: 12px, #FF000000");
        currTool.setHorizontalAlignment(JLabel.CENTER);
        // strokeWidth = new JLabel("Stroke Width: 12px");
        // strokeColor = new JLabel("Stroke Color: #FFFFFF");

        this.add(mouse);
        this.add(canvas);
        this.add(currTool);
        // this.add(strokeWidth);
        // this.add(strokeColor);

    }
}
