import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PanelTopbar extends JPanel implements ActionListener, ChangeListener {
    // Defulat value to 12
    public static int thicknessValue = 12;

    private JButton save, clear, help, info;
    private JLabel putLogo;
    private JSlider thickness;

    private PopupHelp helpPanel;
    private PopupFileChooser fileChooser;

    // preview panel is global
    public static PanelPreview preview;

    public PanelTopbar() {
        super(new GridLayout());

        JPanel logo = new JPanel();
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel();

        // Create borders around JPanels to divide into corresponding sections
        chooseThickness.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Stroke Thickness"));
        extras.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Other Actions"));

        // Divided by sections
        putLogo = new JLabel(new ImageIcon("assets/topbar/logo.png"));

        thickness = new JSlider(JSlider.HORIZONTAL, 0, 24, 12);
        preview = new PanelPreview();

        save = new JButton(new ImageIcon("assets/topbar/save.png"));
        clear = new JButton(new ImageIcon("assets/topbar/newDoc.png"));
        help = new JButton(new ImageIcon("assets/topbar/help.png"));
        info = new JButton(new ImageIcon("assets/topbar/info.png"));

        // Adding to corresponding sections
        logo.add(putLogo);

        chooseThickness.add(thickness);
        chooseThickness.add(preview);

        extras.add(save);
        extras.add(clear);
        extras.add(help);
        extras.add(info);

        this.add(logo);
        this.add(chooseThickness);
        this.add(extras);

        // Adding action listeners
        clear.addActionListener(this);
        save.addActionListener(this);
        help.addActionListener(this);
        info.addActionListener(this);
        thickness.addChangeListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            int result = JOptionPane.showConfirmDialog(Main.paint, "Clear current screen contents?","Clear Screen", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            // If yes confirmation
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

        // Updates preview every time the slider is dragged
        preview.repaint();
    }
}
