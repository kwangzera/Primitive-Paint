import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Sidebar extends JPanel implements ActionListener {
    private JButton a, b, c, d, e, f, g, h, i;


    public Sidebar() {
        super();
        // this
        // JPanel this =new JPanel();

        // this.setPreferredSize(new Dimension(0, 0));

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
        this.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));

        String aa = "assets/tools/penTool.png";
        String bb = "assets/tools/lineTool.png";
        String cc = "assets/tools/eraserTool.png";
        String dd = "assets/tools/ovalBorderTool.png";
        String ee = "assets/tools/ovalFillTool.png";
        String ff = "assets/tools/rectBorderTool.png";
        String gg = "assets/tools/rectFillTool.png";
        String hh = "assets/tools/colourPicker.png";
        String ii = "assets/tools/eyedropperTool.png";

        ImageIcon aaa = new ImageIcon(aa);
        ImageIcon bbb = new ImageIcon(bb);
        ImageIcon ccc = new ImageIcon(cc);
        ImageIcon ddd = new ImageIcon(dd);
        ImageIcon eee = new ImageIcon(ee);
        ImageIcon fff = new ImageIcon(ff);
        ImageIcon ggg = new ImageIcon(gg);
        ImageIcon hhh = new ImageIcon(hh);
        ImageIcon iii = new ImageIcon(ii);

        a = new JButton(aaa);
        b = new JButton(bbb);
        c = new JButton(ccc);
        d = new JButton(ddd);
        e = new JButton(eee);
        f = new JButton(fff);
        g = new JButton(ggg);
        h = new JButton(hhh);
        // i = new JButton(iii);
        // i = new JButton(ph);
        c.addActionListener(this);
        a.addActionListener(this);

        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(a);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(b);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(c);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(d);
        this.add(Box.createRigidArea(new Dimension(0, 8)));
        this.add(e);
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
            // Canvas.shapes.clear();
            System.out.println("b1");
            // System.out.println(Canvas.shapes.size());
            // System.out.println(199);
            // PaintApp.canvas.repaint();
        } if (e.getSource() == c) {
            System.out.println("b2");
            // save(PaintApp.canvas);
            // currentTool = eraser1;
        }
    }

}
