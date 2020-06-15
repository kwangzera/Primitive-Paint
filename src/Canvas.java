import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Canvas extends JPanel implements MouseMotionListener, MouseListener {
    // public static int[] temp = new int[6];
    public static ArrayList<InfoTool> shapes = new ArrayList<>();
    // private Pen pen1 = new Pen(this);
    // private Eraser eraser1 = new Eraser(this);
    // private Tool currentTool = pen1;
    private static int x = -10, y = -10;

    public static Mouse eraser = new Eraser();
    public static Mouse pen1 = new Pen();
    public static Mouse curr = pen1;
    // public static Tool curr = new Tool();
    public Canvas() {
        this.setBackground(Color.PINK);
        // this.setPreferredSize(new Dimension(420, 420));
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        this.curr.mouseDrag(shapes, e);
        this.repaint();
    }

    public void mousePressed(MouseEvent e){
        this.curr.mouseDown(shapes, e);
        System.out.println("click");
        System.out.println(shapes);
    }

    public void mouseReleased(MouseEvent e){
        this.curr.mouseUp(shapes, e);
        System.out.println("unclicc");
        System.out.println(Sidebar.currentToolID);
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e){
        // flag = true;
        // System.out.println("click2");
    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Graphics2D g2 = (Graphics2D) g;
        // Graphics2D g2d = (Graphics2D) g;
        // super.paintComponent(g2d);
        // currentTool.draw(g2d);
        // repaint();
        // paint(g);

        // g.setColor(Color.BLUE);
        // g2.setStroke(new BasicStroke(Topbar.thicknessValue, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        // g2.setStroke(new BasicStroke(3));
        for (InfoTool i : shapes) {
            // g2.setStroke(new BasicStroke(Topbar.thicknessValue, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            i.draw(g);
        }
        // gonna get slow when arraylist is fat and large
        // if shapes;
        // g.drawOval(0, 0, 400, 400);
    }
}
