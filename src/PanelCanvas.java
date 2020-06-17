import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PanelCanvas extends JPanel implements MouseMotionListener, MouseListener {
    public static ArrayList<DrawTool> shapes = new ArrayList<>();

    public static CreateTool eraser = new CreateEraser();
    public static CreateTool pen1 = new CreatePen();
    public static CreateTool line1 = new CreateLine();
    public static CreateTool rect1 = new CreateRect();
    public static CreateTool oval1 = new CreateOval();

    public static CreateTool curr = pen1;
    
    public PanelCanvas() {
        this.setBackground(Color.WHITE);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        this.curr.mouseDragged(e);
        this.repaint();
    }

    public void mousePressed(MouseEvent e){
        this.curr.mousePressed(e);
        this.repaint();
    }

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

        for (DrawTool i : shapes) {
            i.draw(g);
        }
    }
}
