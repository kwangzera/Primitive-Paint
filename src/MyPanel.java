import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class MyPanel extends JPanel {
    // For the topbar
    private static int x = -10, y = -10;

    private JButton colour, save, clear, help, info;
    private JLabel logo, thicknessLab, othersLab;
    private JSlider thickness;
    private JLabel putLogo;

    // For the side buttons (temporary var names)
    private JButton a, b, c, d, e, f, g, h, i;
    private JButton[] sideButtons = {a, b, c, d, e, f, g, i};

    public MyPanel() {
        File dir = new File("assets/tools");
        File[] directoryListing = dir.listFiles();

        // for (File child : directoryListing) {
        //     System.out.println(child);
        // }

        // temporary testing purposes
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
        
        this.setPreferredSize(new Dimension(800, 561));
        // this.setBackground(Color.WHITE);

        // Creating a topSelect JPanel for formatting
        // GridBagLayout layout, like grid, but more customizable
        JPanel topSelect = new JPanel(new GridLayout());
        JPanel logo = new JPanel(new GridLayout());
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel(new FlowLayout());
        JPanel sidebar = new JPanel();

        // don't know why it won't let me set it in constructor of sidebar
        BoxLayout layout = new BoxLayout(sidebar, BoxLayout.Y_AXIS);
        sidebar.setLayout(layout);
        // sidebar.setAlignmentY(Component.CENTER_ALIGNMENT);
        sidebar.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
        // sidebar.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
        // Scrollbars for RGB
        thickness = new JSlider(JSlider.HORIZONTAL, 0, 50, 10);
        thickness.setMinorTickSpacing(5);
        thickness.setMajorTickSpacing(50);
        // thickness.setPaintTicks(true);
        thickness.setPaintLabels(true);

        // Lables showing RGB amounts
        chooseThickness.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Thickness in Pixels"));
        // actions.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Actions"));
        extras.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Other Actions"));
        // thicknessLab = new JLabel("0");
        // othersLab = new JLabel("50");

        putLogo = new JLabel(new ImageIcon("assets/topbar/logo.png"));

        // array-fy this
        save = new JButton();
        save.setIcon(new ImageIcon("assets/topbar/save.png"));
        clear = new JButton(new ImageIcon("assets/topbar/newDoc.png"));
        help = new JButton(new ImageIcon("assets/topbar/help.png"));
        info = new JButton(new ImageIcon("assets/topbar/info.png"));
        logo.add(putLogo);
        // chooseThickness.add(new JLabel("0"));
        chooseThickness.add(thickness);
        // chooseThickness.add(new JLabel("50"));

        a = new JButton(aaa);
        Pen Pen1 = new Pen(this, a, -10, -10);
        // repaint();
        b = new JButton(bbb);
        c = new JButton(ccc);
        d = new JButton(ddd);
        e = new JButton(eee);
        f = new JButton(fff);
        g = new JButton(ggg);
        h = new JButton(hhh);
        i = new JButton(iii);
        // i = new JButton(ph);
        // a.addActionListener(this);

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

        extras.add(save);
        extras.add(clear);
        extras.add(help);
        extras.add(info);

        topSelect.add(logo);
        topSelect.add(chooseThickness);
        topSelect.add(extras);
        
        this.setLayout(new BorderLayout());
        this.add(topSelect, BorderLayout.NORTH);
        this.add(sidebar, BorderLayout.WEST);
    }

    // public void actionPerformed(ActionEvent e) {
    //     if (e.getSource() == a) {
    //         System.out.println("hi"); 
    //     }
    // }

    // public void mouseMoved(MouseEvent e) {

    // }

    // public void mouseDragged(MouseEvent e) {
    //     x = e.getX();
    //     y = e.getY();
    //     repaint();
    // }
}
