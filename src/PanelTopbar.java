import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PanelTopbar extends JPanel implements ActionListener, ChangeListener {
    private JButton save, clear, help, info;
    private JSlider thickness;
    private JLabel putLogo;
    public static int thicknessValue = 10;
    private PopupHelp helpPanel;
    private PopupFileChooser fileChooser;
    public static PanelPreview preview;

    public PanelTopbar() {
        super(new GridLayout());

        JPanel logo = new JPanel();
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel();

        chooseThickness.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Line Thickness"));
        extras.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Other Actions"));

        thickness = new JSlider(JSlider.HORIZONTAL, 0, 25, 10);
        putLogo = new JLabel(new ImageIcon("assets/topbar/logo.png"));
        save = new JButton();
        save.setIcon(new ImageIcon("assets/topbar/save.png"));
        clear = new JButton(new ImageIcon("assets/topbar/newDoc.png"));
        help = new JButton(new ImageIcon("assets/topbar/help.png"));
        info = new JButton(new ImageIcon("assets/topbar/info.png"));
        preview = new PanelPreview();

        chooseThickness.add(thickness);
        chooseThickness.add(preview);

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
                PanelCanvas.shapes.clear();
                PaintApp.canvas.repaint();
            }

        } if (e.getSource() == save) {
            fileChooser = new PopupFileChooser(PaintApp.canvas);

        } if (e.getSource() == help) {
            helpPanel = new PopupHelp();

        } if (e.getSource() == info) {
            JOptionPane.showMessageDialog(Main.paint, "Version 1.0.0", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void stateChanged(ChangeEvent e) {
        thicknessValue = thickness.getValue();
        preview.repaint();
    }
}
