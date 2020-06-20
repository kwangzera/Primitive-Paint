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

    private JLabel colorHelp = new JLabel(
        "<html><p> The color picker is the 8th button on the sidebar. " +
        "Click on it to open up prompt where the current drawing color can be chosen. " + 
        "A Basic selection colors can be accessed through the \"Swatches\" tab. " +
        "A more vast selection and transparent colors can be accessed through the \"HSV\", \"HSL\", \"RGB\", and \"CMYK\" tabs. </p></html>",
        SwingConstants.LEFT);

    private JLabel thicknessHelp = new JLabel(
        "<html><p> The thickness slider is located in the topbar, under the section \"Stroke Thickness\". " +
        "The thickness of a stroke can range from 1px to 24px. " +
        "By default, the stroke thickness is 12px, which is half of the maximum." +
        "On the right of the thickness slider, there is a preview that shows the current stroke color and size. " +
        "In addition, a crosshair is located behind the stroke preview to make it easier to show transparent colors. </p></html>",
        SwingConstants.LEFT);

    private JLabel saveHelp = new JLabel(
        "<html><p> The save button is located in the topbar, specifically the first button under the section \"Other Actions\". " +
        "Click on the save button to bring up a file save prompt." +
        "The default directory of the prompt will be the same directory as the batch file." +
        "Once the desired file location to save the image is chosen, click the save button to export the drawing. " +
        "The image will be exported as a png file, where .png will be automatically added to any save file name entered. </p></html>",
        SwingConstants.LEFT);

    private JLabel clearHelp = new JLabel(
        "<html><p> The clear button is located in the topbar, specifically the second button under the section \"Other Actions\". " +
        "Once clicked, a prompt will appear asking to confirm the clearance of all drawings currently on the canvas. " +
        "If the answer is yes, then everything will be cleared only leaving a white background. <html><p>",
        SwingConstants.LEFT);

    // Parallel arrays for more efficient way of adding these JLabels to the JTabbedPane
    private JLabel[] helpArr = {penHelp, eraserHelp, lineHelp, ovalHelp, rectHelp, colorHelp, thicknessHelp, saveHelp, clearHelp};
    private String[] headers = {"Pen", "Eraser", "Line", "Oval", "Rectangle", "Color", "Thickness", "Save", "Clear"};

    public PopupHelp() {
        JTabbedPane tp = new JTabbedPane();

        for (int i = 0; i < 9; i++) {
            tp.add(headers[i], helpArr[i]);
            helpArr[i].setVerticalAlignment(JLabel.TOP);
            helpArr[i].setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        // Dialog.ModalityType.DOCUMENT_MODAL makes it so you can't interact with the parent window when the child window is active
        JDialog dialog = new JDialog(Main.paint, "Help", Dialog.ModalityType.DOCUMENT_MODAL);

        dialog.add(tp);
        dialog.setSize(523, 200);
        dialog.setLocationRelativeTo(Main.paint);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }
}
