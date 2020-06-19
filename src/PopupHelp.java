import java.awt.*;
import javax.swing.*;

public class PopupHelp {
    // Inscribed HTML used for multiline JLabel, end tags not needed
    // The following formatted in the way it would look in the app
    private JLabel penHelp = new JLabel(
        "<html> Click and drag to erase",
        JLabel.LEFT);

    private JLabel eraserHelp = new JLabel(
        "<html> Click and drag to erase", 
        SwingConstants.LEFT);

    private JLabel lineHelp = new JLabel(
        "<html> Click and drag to create a line", 
        SwingConstants.LEFT);

    private JLabel ovalHelp = new JLabel(
        "<html> Click and drag to create a line. Can be filled or border only.", 
        SwingConstants.LEFT);

    private JLabel rectHelp = new JLabel(
        "<html> Click and drag to create a line. Can be filled or border only.", 
        SwingConstants.LEFT);

    private JLabel colourHelp = new JLabel(
        "<html> Click to choose a color, including transparency", 
        SwingConstants.LEFT);

    private JLabel saveHelp = new JLabel(
        "<html> Click to open to file chooser. Locate to desired path, name your file, and click save.", 
        SwingConstants.LEFT);

    private JLabel clearHelp = new JLabel(
        "<html> Clears all drawings from the screen", 
        SwingConstants.LEFT);

    // Parallel arrays for more efficient way of adding these JLabels to the JTabbedPane
    private JLabel[] helpArr = {penHelp, eraserHelp, lineHelp, ovalHelp, rectHelp, colourHelp, saveHelp, clearHelp};
    private String[] headers = {"Pen", "Line", "Eraser", "Oval", "Rectangle", "Colour Picker", "File Chooser", "Clear Screen"};

    public PopupHelp() {
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

