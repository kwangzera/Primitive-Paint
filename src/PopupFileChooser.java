import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class PopupFileChooser {
    private PanelCanvas canvas;
    private JFileChooser fileChooser;
    
    public PopupFileChooser(PanelCanvas canvas) {
        this.canvas = canvas;

        BufferedImage paintImage = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
        canvas.paint(paintImage.getGraphics());

        File userDir = new File(System.getProperty("user.dir"));

        fileChooser = new JFileChooser(userDir);
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        int saveVal = fileChooser.showSaveDialog(Main.paint);

        if (saveVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                file = new File(file.getAbsolutePath() + ".png");

                ImageIO.write(paintImage, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
