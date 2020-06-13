import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Sidebar extends JPanel implements ActionListener {
    private JButton a, b, c, d, e, f, g, h, i;
    private JPanel sidebar =new JPanel();

    public Sidebar() {


        this.setPreferredSize(new Dimension(100, 100));

        BoxLayout layout = new BoxLayout(sidebar, BoxLayout.Y_AXIS);
        sidebar.setLayout(layout);

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
        i = new JButton(iii);
        // i = new JButton(ph);
        c.addActionListener(this);
        a.addActionListener(this);

        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(a);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(b);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(c);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(d);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(e);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(f);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(g);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(h);
        sidebar.add(Box.createRigidArea(new Dimension(0, 8)));
        sidebar.add(i);

        this.add(sidebar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            System.out.println(199);
            // currentTool = pen1;
            // save(PaintApp.panel);
        } if (e.getSource() == c) {
            System.out.println(299);
            save(PaintApp.canvas);
            // currentTool = eraser1;
        }
    }

    public void save(Canvas canvas){
        BufferedImage paintImage = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
        canvas.paint(paintImage.getGraphics());
        // repaint();

        try{
            ImageIO.write(paintImage, "png", new File("lmao.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
