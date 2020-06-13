import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.geom.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.util.*;

public class Canvas extends JPanel implements MouseMotionListener, MouseListener {
    // public static int[] temp = new int[6];
    public static ArrayList<int[]> shapes = new ArrayList<int[]>();
    private boolean flag = true;
    // private Pen pen1 = new Pen(this);
    // private Eraser eraser1 = new Eraser(this);
    // private Tool currentTool = pen1;
    private static int x = -10, y = -10;
    private int prev_x = x, prev_y = y;

    public Canvas() {
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(420, 420));
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        // int[] temp;
        // boolean flag = true;
        int new_x = e.getX();
        int new_y = e.getY();

        if (flag) {
            int[] temp = {new_x, new_y, new_x, new_y, 21, 21};
            shapes.add(temp);
            System.out.println(Arrays.toString(temp));
            flag = false;
            x = new_x;
            y = new_y;

        } else {            
            int[] temp = {x, y, new_x, new_y, 21, 21};
            x = new_x;
            y = new_y;

            shapes.add(temp);
            System.out.println("dragged: "+ Arrays.toString(temp));
            
            // temp[0] = x;
            // temp[1] = y;
            // temp[2] = new_x;
            // temp[3] = new_y;
            // temp[4] = 10;
            // temp[5] = 10;

            // shapes.add(temp);
        }
        this.repaint();
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

    public void mousePressed(MouseEvent e){
        flag = true;
        System.out.println("click");
    }

    public void mouseReleased(MouseEvent e){
        flag = false;
        System.out.println("unclicc");
    }

    public int getMouseX() {
        return x;
    }

    public int getMouseY() {
        return y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // Graphics2D g2d = (Graphics2D) g;
        // super.paintComponent(g2d);
        // currentTool.draw(g2d);
        // repaint();
        // paint(g);

        g.setColor(Color.WHITE);
        // g2.setStroke(new BasicStroke(3));
        for (int i = 0; i < shapes.size(); i++) {
            g2.setStroke(new BasicStroke(shapes.get(i)[5]));
            // g2.fill(new Ellipse2D.Double(i[0]-5, i[1]-5, i[5], i[5]));
            g.drawLine(shapes.get(i)[0], shapes.get(i)[1], shapes.get(i)[2], shapes.get(i)[3]);

        }
        // gonna get slow when arraylist is fat and large
        // if shapes;
        // g.drawImage(paintImage, 0, 0, null);
    }
}
