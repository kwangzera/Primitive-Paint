import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class MyPanel extends JPanel {
    // For the top
    private JButton colour, save, clear, help, info;
    
    // For the sides (temporary var names)
    private JButton a, b, c, d, e, f, g, h;
    // private JButton[] lol = {a, b, c, d, e, f, g};
    private JLabel logo, thicknessLab, othersLab;
    private JSlider thickness;
    private JLabel putLogo;

    public MyPanel() {
        ImageIcon picture = new ImageIcon("assets/save.png");
        ImageIcon newDocIcon = new ImageIcon("assets/newDoc.png");
        ImageIcon ph = new ImageIcon("assets/placeholder.png");
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.WHITE);

        // Creating a topSelect JPanel for formatting
        // GridBagLayout layout, like grid, but more customizable
        JPanel topSelect = new JPanel(new GridLayout());
        JPanel logo = new JPanel(new GridLayout());
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel();
        JPanel sidebar = new JPanel();

        // don't know why it won't let me set it in constructor of sidebar
        BoxLayout layout = new BoxLayout(sidebar, BoxLayout.Y_AXIS);
        sidebar.setLayout(layout);
        sidebar.setAlignmentX(Component.CENTER_ALIGNMENT);
        sidebar.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
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

        putLogo = new JLabel(new ImageIcon("assets/logo.png"));

        // array-fy this
        save = new JButton();
        save.setIcon(new ImageIcon("assets/save.png"));
        clear = new JButton(new ImageIcon("assets/newDoc.png"));
        help = new JButton(new ImageIcon("assets/help.png"));
        info = new JButton(new ImageIcon("assets/info.png"));
        logo.add(putLogo);
        // chooseThickness.add(new JLabel("0"));
        chooseThickness.add(thickness);
        // chooseThickness.add(new JLabel("50"));

        a = new JButton(ph);
        b = new JButton(ph);
        c = new JButton(ph);
        d = new JButton(ph);
        e = new JButton(ph);
        f = new JButton(ph);
        g = new JButton(ph);
        h = new JButton(ph);
        // i = new JButton(ph);

        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(a);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(b);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(c);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(d);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(e);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(f);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(g);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(h);
        // sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        // sidebar.add(i);


        extras.add(save);
        extras.add(clear);
        extras.add(help);
        extras.add(info);

        // topSelect.
        topSelect.add(logo);
        topSelect.add(chooseThickness);
        // topSelect.add(actions);
        topSelect.add(extras);


        // Change the grid layout to border layout to align North
        this.setLayout(new BorderLayout());
        this.add(topSelect, BorderLayout.NORTH);
        this.add(sidebar, BorderLayout.WEST);
    }
}
