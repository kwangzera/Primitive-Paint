import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class PopupFileChooser {
    private JFileChooser fileChooser;

    // static? bc it is already used static
    public PopupFileChooser(PanelCanvas canvas) {
        // Copy over canvas items to a BufferedImage
        BufferedImage paintImage = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
        canvas.paint(paintImage.getGraphics());

        // Current directory (location of run.batch)
        File userDir = new File(System.getProperty("user.dir"));

        // When JFileChooser opens, it gets set to the current directory
        fileChooser = new JFileChooser(userDir);
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        int saveVal = fileChooser.showSaveDialog(Main.paint);

        // If the user selectes save
        if (saveVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();

                // Autosaves to .png if user forgets to include .png after they saved 
                file = new File(file.getAbsolutePath() + ".png");

                ImageIO.write(paintImage, "png", file);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
