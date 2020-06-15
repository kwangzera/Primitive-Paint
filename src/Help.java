import javax.swing.*;
import java.awt.*;

public class Help {
    private JLabel penHelp = new JLabel("Pen Tool", JLabel.LEFT);
    private JLabel lineHelp = new JLabel("Line Tool", SwingConstants.LEFT);
    // private JLabel eraserHelp = new JLabel("Description for pen");
    // private JLabel ovalEmptyHelp = new JLabel("Description for pen");
    // private JLabel ovalFilledHelp = new JLabel("Description for pen");
    // private JLabel rectEmptyHelp = new JLabel("Description for pen");
    // private JLabel rectFilledHelp = new JLabel("Description for pen");
    // private JLabel colourHelp = new JLabel("Description for pen");
    // private JLabel saveHelp = new JLabel("Description for pen");
    // private JLabel newPageHelp = new JLabel("Description for pen");
    // private JLabel thicknessHelp = new JLabel("Description for pen");

    public Help() {
        JTabbedPane tp = new JTabbedPane();
        tp.add("Pen", penHelp);
        penHelp.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        penHelp.setVerticalAlignment(JLabel.TOP);
        tp.add("Eraser", lineHelp);

        JDialog dialog = new JDialog(Main.paint, "Help", Dialog.ModalityType.DOCUMENT_MODAL);
        dialog.add(tp);
        dialog.setSize(400, 300);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(Main.paint);
        dialog.setVisible(true);
    }
}