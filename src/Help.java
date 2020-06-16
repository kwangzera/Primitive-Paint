import javax.swing.*;
import java.awt.*;

public class Help {
    private JLabel penHelp = new JLabel("Pen Tool", JLabel.LEFT);
    private JLabel eraserHelp = new JLabel("Eraser Tool", SwingConstants.LEFT);
    private JLabel lineHelp = new JLabel("Line Tool", SwingConstants.LEFT);
    private JLabel ovalHelp = new JLabel("Oval Tool", SwingConstants.LEFT);
    private JLabel rectHelp = new JLabel("Rect Tool", SwingConstants.LEFT);
    private JLabel colourHelp = new JLabel("Colour Chooser", SwingConstants.LEFT);
    private JLabel saveHelp = new JLabel("File Chooser", SwingConstants.LEFT);
    private JLabel clearHelp = new JLabel("Clear Screen", SwingConstants.LEFT);

    private JLabel[] helpArr = {penHelp, eraserHelp, lineHelp, ovalHelp, rectHelp, colourHelp, saveHelp, clearHelp};
    private String[] headers = {"Pen", "Line", "Eraser", "Oval", "Rectangle", "Colour Picker", "File Chooser", "Clear Screen"};
    // private JLabel newPageHelp = new JLabel("Description for pen");
    // private JLabel thicknessHelp = new JLabel("Description for pen");

    public Help() {
        JTabbedPane tp = new JTabbedPane();

        for (int i = 0; i < 8; i++) {
            tp.add(headers[i], helpArr[i]);
            helpArr[i].setVerticalAlignment(JLabel.TOP);
            helpArr[i].setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        JDialog dialog = new JDialog(Main.paint, "Help", Dialog.ModalityType.DOCUMENT_MODAL);

        dialog.add(tp);
        dialog.setSize(569, 200);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(Main.paint);
        dialog.setVisible(true);
    }
}