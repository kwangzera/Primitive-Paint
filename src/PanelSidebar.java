import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelSidebar extends JPanel implements ActionListener {
    // Array of buttons for efficient looping
    private JButton pen, line, eraser, ovalE, ovalF, rectE, rectF, color;
    private JButton[] buttonList = {pen, line, eraser, ovalE, ovalF, rectE, rectF, color};

    public static Color currentColor = Color.BLACK;
    public static boolean filled = false;

    public PanelSidebar() {
        super();

        // BoxLayout for vertically aligned items
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));

        ImageIcon[] icons = {
            new ImageIcon("assets/tools/penTool.png"),
            new ImageIcon("assets/tools/eraserTool.png"),
            new ImageIcon("assets/tools/lineTool.png"),
            new ImageIcon("assets/tools/ovalBorderTool.png"),
            new ImageIcon("assets/tools/ovalFillTool.png"),
            new ImageIcon("assets/tools/rectBorderTool.png"),
            new ImageIcon("assets/tools/rectFillTool.png"),
            new ImageIcon("assets/tools/colorPicker.png")
        };

        for (int i = 0; i < 8; i++) {
            // Separator
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
            PanelCanvas.curr = PanelCanvas.eraser;

        if (e.getSource() == buttonList[2])
            PanelCanvas.curr = PanelCanvas.line;

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

        // Color chooser
        } if (e.getSource() == buttonList[7]) {
            Color tempColor = JColorChooser.showDialog(Main.paint, "Pick a Color", Color.BLACK);

            if (tempColor != null)
                currentColor = tempColor;

            PanelTopbar.preview.repaint();
        }
    }
}
