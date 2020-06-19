import java.awt.*;
import javax.swing.*;

public class PopupHelp {
    // <html> used for multiline JLabel text
    // <p> tag is used for wordwrap
    private JLabel penHelp = new JLabel(
        "<html><p> The pen tool is the first item on the sidebar and is the defualt tool selected when the app starts. " + 
        "Click on the pen button to set it to the current tool, assuming it is not already. " +
        "To draw, click once on the canvas to make a dot or click and drag to freehand draw. " +
        "In addition, its color and size can be changed. </p></html>",
        JLabel.LEFT);

    private JLabel eraserHelp = new JLabel(
        "<html><p> The eraser tool is the second item on the sidebar, and is the always the background color of the canvas (white). " +
        "Click on the eraser tool button to set it to the current tool." + 
        "To erase, click once on the canvas to erase to dot or click and drag to freehand erase. " +
        "Unlike the pen tool, only its size can be changed. </p></html>",
        SwingConstants.LEFT);

    private JLabel lineHelp = new JLabel(
        "<html><p> The line tool is the third item on the sidebar. " +
        "Click on the line tool button to set it to the current tool. " +
        "To draw a line, click and drag. " +
        "In addition, its color and size can be changed. </p></html>",
        SwingConstants.LEFT);

    private JLabel ovalHelp = new JLabel(
        "<html><p> The oval tool is the 4th (border only) and 5th (filled) item on the sidebar." +
        "Click on the oval tool button to set it to the current tool. " +
        "To draw an oval, click and drag. " +
        "In addition, its color, size, and style (border only or filled) can be changed.</p></html>",
        SwingConstants.LEFT);

    private JLabel rectHelp = new JLabel(
        "<html><p> The rectangle tool is the 6th (border only) and 7th (filled) item on the sidebar." +
        "Click on the rectangle tool button to set it to the current tool. " +
        "To draw an rectangle, click and drag. " +
        "In addition, its color, size, and style (border only or filled) can be changed. </p></html>",
        SwingConstants.LEFT);

    private JLabel colourHelp = new JLabel(
        "<html><p> The color picker is the 8th tool on the sidebar. " +
        "Click on it to open up prompt where you can choose the current drawing color. " + 
        "A Basic selection colors can be accessed through the \"Swatches\" tab. " +
        "A more vast selection and transparent colors can be accessed through the \"HSV\", \"HSL\", \"RGB\", and \"CMYK\" tabs. </p></html>",
        SwingConstants.LEFT);

    private JLabel thicknessHelp = new JLabel(
        "<html><p> Drag to change thickness, crosshair to show transparency" +
        "</p></html>",
        SwingConstants.LEFT);

    private JLabel saveHelp = new JLabel(
        "<html><p> Click to open to file chooser. Locate to desired path, name your file, and click save." +
        "</p></html>",
        SwingConstants.LEFT);

    private JLabel clearHelp = new JLabel(
        "<html><p> Clears all drawings from the screen" +
        "<html><p>",
        SwingConstants.LEFT);

    // Parallel arrays for more efficient way of adding these JLabels to the JTabbedPane
    private JLabel[] helpArr = {penHelp, eraserHelp, lineHelp, ovalHelp, rectHelp, colourHelp, thicknessHelp, saveHelp, clearHelp};
    private String[] headers = {"Pen", "Eraser", "Line", "Oval", "Rectangle", "Colour", "Thickness", "Save", "Clear"};

    public PopupHelp() {
        JTabbedPane tp = new JTabbedPane();

        for (int i = 0; i < 9; i++) {
            tp.add(headers[i], helpArr[i]);
            helpArr[i].setVerticalAlignment(JLabel.TOP);
            helpArr[i].setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        JDialog dialog = new JDialog(Main.paint, "Help", Dialog.ModalityType.DOCUMENT_MODAL);

        dialog.add(tp);
        dialog.setSize(523, 200);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(Main.paint);
        dialog.setVisible(true);
    }
}

