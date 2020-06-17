import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelSidebar extends JPanel implements ActionListener {
    private JButton pen, line, eraser, ovalE, ovalF, rectE, rectF, colour;
    private JButton[] buttonList = {pen, line, eraser, ovalE, ovalF, rectE, rectF, colour};

    public static int currentToolID = 0;
    public static Color currentColor = Color.BLACK;
    public static boolean filled = false;

    public PanelSidebar() {
        super();

        // BoxLayout for vertically aligned items
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));

        ImageIcon[] icons = {
            new ImageIcon("assets/tools/penTool.png"),
            new ImageIcon("assets/tools/lineTool.png"),
            new ImageIcon("assets/tools/eraserTool.png"),
            new ImageIcon("assets/tools/ovalBorderTool.png"),
            new ImageIcon("assets/tools/ovalFillTool.png"),
            new ImageIcon("assets/tools/rectBorderTool.png"),
            new ImageIcon("assets/tools/rectFillTool.png"),
            new ImageIcon("assets/tools/colourPicker.png")
        };

        for (int i = 0; i < 8; i++) {
            this.add(Box.createRigidArea(new Dimension(0, 8)));
            buttonList[i] = new JButton(icons[i]);
            buttonList[i].addActionListener(this);
            this.add(buttonList[i]);
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Freehand and lines
        if (e.getSource() == buttonList[0])
            PanelCanvas.curr = PanelCanvas.pen;

        if (e.getSource() == buttonList[1])
            PanelCanvas.curr = PanelCanvas.line;

        if (e.getSource() == buttonList[2])
            PanelCanvas.curr = PanelCanvas.eraser;

        // Shapes
        if (e.getSource() == buttonList[3]) {
            filled = false;
            PanelCanvas.curr = PanelCanvas.oval;

        } if (e.getSource() == buttonList[4]) {
            filled = true;
            PanelCanvas.curr = PanelCanvas.oval;

        } if (e.getSource() == buttonList[5]) {
            filled = false;
            PanelCanvas.curr = PanelCanvas.rect;

        } if (e.getSource() == buttonList[6]) {
            filled = true;
            PanelCanvas.curr = PanelCanvas.rect;

        // Colour chooser
        } if (e.getSource() == buttonList[7]) {
            currentToolID = 7;
            currentColor = JColorChooser.showDialog(Main.paint, "Pick a Colour", Color.BLACK);
        }
    }
}
