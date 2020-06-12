/*
Kevin Wang
June 9, 2020
Final Project: Paint Application
ICS3U7-02, Ms. Strelkovska
*/

import java.awt.*;
// import java.io.IOException;

import javax.swing.*;

// import javafx.scene.paint.Color;

// run with bat
public class PaintApp {
    public static MyPanel panel = new MyPanel();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Primitive Paint");
        // super("Primitive Paint");

        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBackground(Color.WHITE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        // new MyFrame();
    }
}
