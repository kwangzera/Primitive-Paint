import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
// import javafx.beans.value.ChangeListener;

import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class Topbar extends JPanel implements ActionListener, ChangeListener {
    private JButton save, clear, help, info;
    private JSlider thickness;
    private JLabel putLogo;
    private static int thicknessValue = 10; //10 is defualt

    public Topbar() {
        // this.setPreferredSize(new Dimension(800, 0));
        super(new GridLayout());
        // JPanel topSelect = new JPanel(new GridLayout());
        JPanel logo = new JPanel();
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel();

        chooseThickness.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Thickness in Pixels"));
        // actions.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Actions"));
        extras.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Other Actions"));

        thickness = new JSlider(JSlider.HORIZONTAL, 0, 50, 10);
        thickness.setMinorTickSpacing(5);
        thickness.setMajorTickSpacing(50);
        // thickness.setPaintTicks(true);
        thickness.setPaintLabels(true);
        putLogo = new JLabel(new ImageIcon("assets/topbar/logo.png"));
        save = new JButton();
        save.setIcon(new ImageIcon("assets/topbar/save.png"));
        clear = new JButton(new ImageIcon("assets/topbar/newDoc.png"));
        help = new JButton(new ImageIcon("assets/topbar/help.png"));
        info = new JButton(new ImageIcon("assets/topbar/info.png"));
        chooseThickness.add(thickness);

        logo.add(putLogo);

        extras.add(save);
        extras.add(clear);
        extras.add(help);
        extras.add(info);

        this.add(logo);
        this.add(chooseThickness);
        this.add(extras);
        // this.addMouseMotionListener(this);
        // this.setLayout(new BorderLayout());
        // this.add(this);
        clear.addActionListener(this);
        save.addActionListener(this);
        thickness.addChangeListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            Canvas.shapes.clear();
            // System.out.println("Yeet");
            // System.out.println(Canvas.shapes.size());
            System.out.println(199);
            PaintApp.canvas.repaint();
        } if (e.getSource() == save) {
            save(PaintApp.canvas);
        }
    }

    public void stateChanged(ChangeEvent e) {
        // System.out.println(thickness.getValue());
        thicknessValue = thickness.getValue();
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

    public static int getThickness() {
        return thicknessValue;
    }

}