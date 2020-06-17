import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Sidebar extends JPanel implements ActionListener {
    private JButton pen, line, eraser, ovalE, ovalF, rectE, rectF, colour;
    private JButton[] buttonList = {pen, line, eraser, ovalE, ovalF, rectE, rectF, colour};

    public static int currentToolID = 0;
    public static Color currentColor = Color.BLACK;
    public static boolean filled = false;

    public Sidebar() {
        super();

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
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
        if (e.getSource() == buttonList[0])
            Canvas.curr = Canvas.pen1;

        if (e.getSource() == buttonList[1])
            Canvas.curr = Canvas.line1;

        if (e.getSource() == buttonList[2])
            Canvas.curr = Canvas.eraser;

        if (e.getSource() == buttonList[3]) {
            filled = false;
            Canvas.curr = Canvas.oval1;

        } if (e.getSource() == buttonList[4]) {
            filled = true;
            Canvas.curr = Canvas.oval1;

        } if (e.getSource() == buttonList[5]) {
            filled = false;
            Canvas.curr = Canvas.rect1;

        } if (e.getSource() == buttonList[6]) {
            filled = true;
            Canvas.curr = Canvas.rect1;

        // Colour choose tool
        } if (e.getSource() == buttonList[7]) {
            currentToolID = 7;
            currentColor = JColorChooser.showDialog(Main.paint, "Pick a Colour", Color.BLACK);
        }
    }
}
