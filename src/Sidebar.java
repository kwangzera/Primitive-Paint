import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Sidebar extends JPanel implements ActionListener {
    private JButton a, b, c, d, ye, f, g, h;
    public static int currentToolID = 0;
    public static Color currentColor = Color.BLACK;
    public static boolean filled = false;

    public Sidebar() {
        super();

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
        this.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));

        a = new JButton(new ImageIcon("assets/tools/penTool.png"));
        b = new JButton(new ImageIcon("assets/tools/lineTool.png"));
        c = new JButton(new ImageIcon("assets/tools/eraserTool.png"));
        d = new JButton(new ImageIcon("assets/tools/ovalBorderTool.png"));
        ye = new JButton(new ImageIcon("assets/tools/ovalFillTool.png"));
        f = new JButton(new ImageIcon("assets/tools/rectBorderTool.png"));
        g = new JButton(new ImageIcon("assets/tools/rectFillTool.png"));
        h = new JButton(new ImageIcon("assets/tools/colourPicker.png"));

        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        ye.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);

        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(a);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(b);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(c);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(d);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(ye);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(f);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(g);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(h);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            Canvas.curr = Canvas.pen1;

        } if (e.getSource() == b) {
            Canvas.curr = Canvas.line1;

        } if (e.getSource() == c) {
            Canvas.curr = Canvas.eraser;

        } if (e.getSource() == d) {
            filled = false;
            Canvas.curr = Canvas.oval1;

        } if (e.getSource() == ye) {
            filled = true;
            Canvas.curr = Canvas.oval1;

        } if (e.getSource() == f) {
            filled = false;
            Canvas.curr = Canvas.rect1;

        } if (e.getSource() == g) {
            filled = true;
            Canvas.curr = Canvas.rect1;

        // Colour choose tool
        } if (e.getSource() == h) {
            currentToolID = 7;
            currentColor = JColorChooser.showDialog(Main.paint, "Pick a Colour", Color.BLACK);
        }
    }
}
