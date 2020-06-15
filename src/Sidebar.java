import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Sidebar extends JPanel implements ActionListener {
    private JButton a, b, c, d, ye, f, g, h, i;
    public static int currentToolID = 0;

    public Sidebar() {
        super();
        // this
        // JPanel this =new JPanel();

        // this.setPreferredSize(new Dimension(0, 0));

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
        // i = new JButton(iii);
        // i = new JButton(ph);
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
        // this.add(Box.createRigidArea(new Dimension(0, 8)));
        // this.add(i);

        // this.add(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            Canvas.curr = Canvas.pen1;
            System.out.println("b0");

        } if (e.getSource() == b) {
            currentToolID = 1;
            System.out.println("b1");

        } if (e.getSource() == c) {
            Canvas.curr = Canvas.eraser;
            System.out.println("b2");

        } if (e.getSource() == d) {
            currentToolID = 3;
            System.out.println("b3");

        } if (e.getSource() == ye) {
            currentToolID = 4;
            System.out.println("b4");

        } if (e.getSource() == f) {
            currentToolID = 5;
            System.out.println("b5");

        } if (e.getSource() == g) {
            currentToolID = 6;
            System.out.println("b6");

        // Colour choose tool
        } if (e.getSource() == h) {
            currentToolID = 7;
            System.out.println("colour prompt opens");
        }
    }
}
