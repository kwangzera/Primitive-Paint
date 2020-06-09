/*

*/

import java.awt.*;
import javax.swing.*;

// run with bat
public class PaintApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Primitive Paint");
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new MyPanel());
        frame.pack();
    }
}
