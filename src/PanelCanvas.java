import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PanelCanvas extends JPanel implements MouseMotionListener, MouseListener {
    // Global ArrayList of DrawTools (strokes) use for painting
    public static ArrayList<DrawTool> shapes = new ArrayList<>();

    public static CreateTool eraser = new CreateEraser();
    public static CreateTool pen = new CreatePen();
    public static CreateTool line = new CreateLine();
    public static CreateTool rect = new CreateRect();
    public static CreateTool oval = new CreateOval();

    // Set the default tool to pen
    public static CreateTool curr = pen;
    
    public PanelCanvas() {
        this.setBackground(Color.WHITE);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    // Calls the mouseDragged method in the current tool
    public void mouseDragged(MouseEvent e) {
        this.curr.mouseDragged(e);
        this.repaint();
    }

    // Calls the mousePressed method in the current tool
    public void mousePressed(MouseEvent e){
        this.curr.mousePressed(e);
        this.repaint();
    }

    // Calls the mouseReleased method in the current tool
    public void mouseReleased(MouseEvent e){
        this.curr.mouseReleased(e);
        this.repaint();
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Loops through the ArrayList of DrawTools (strokes) and draws them
        for (DrawTool i : shapes) {
            i.draw(g);
        }
    }
}
