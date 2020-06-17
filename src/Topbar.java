import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Topbar extends JPanel implements ActionListener, ChangeListener {
    private JButton save, clear, help, info;
    private JSlider thickness;
    private JLabel putLogo;
    public static int thicknessValue = 10;
    private Help helpPanel;
    private FileChooser fileChooser;

    public Topbar() {
        super(new GridLayout());

        JPanel logo = new JPanel();
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel();

        chooseThickness.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Thickness in Pixels"));
        extras.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Other Actions"));

        thickness = new JSlider(JSlider.HORIZONTAL, 0, 50, 10);
        thickness.setMinorTickSpacing(5);
        thickness.setMajorTickSpacing(50);
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

        clear.addActionListener(this);
        save.addActionListener(this);
        help.addActionListener(this);
        info.addActionListener(this);
        thickness.addChangeListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            int result = JOptionPane.showConfirmDialog(Main.paint, "Clear current screen contents?","Clear Screen", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (JOptionPane.YES_OPTION == result) {
                Canvas.shapes.clear();
                PaintApp.canvas.repaint();
            }

        } if (e.getSource() == save) {
            fileChooser = new FileChooser(PaintApp.canvas);

        } if (e.getSource() == help) {
            helpPanel = new Help();

        } if (e.getSource() == info) {
            JOptionPane.showMessageDialog(Main.paint, "Version 1.0.0", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void stateChanged(ChangeEvent e) {
        thicknessValue = thickness.getValue();
    }
}
