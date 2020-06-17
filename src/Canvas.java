import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Canvas extends JPanel implements MouseMotionListener, MouseListener {
    public static ArrayList<InfoTool> shapes = new ArrayList<>();

    public static Tool eraser = new Eraser();
    public static Tool pen1 = new Pen();
    public static Tool line1 = new Line();
    public static Tool rect1 = new Rectangle();
    public static Tool oval1 = new Oval();

    public static Tool curr = pen1;
    
    public Canvas() {
        this.setBackground(Color.WHITE);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        this.curr.mouseDrag(shapes, e);
        this.repaint();
    }

    public void mousePressed(MouseEvent e){
        this.curr.mouseDown(shapes, e);
        this.repaint();
    }

    public void mouseReleased(MouseEvent e){
        this.curr.mouseUp(shapes, e);
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

        for (InfoTool i : shapes) {
            i.draw(g);
        }
    }
}
