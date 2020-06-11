import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Draw extends JPanel implements ActionListener, MouseMotionListener {
    private JButton a;
    private JPanel panel;
    private int x = 10, y = 10;
    public static int fda;
    
    public Draw(JPanel panel, JButton button, int x_pos, int y_pos) {
        this.panel = panel;
        this.a = button;
        this.x = x_pos;
        this.y = y_pos;


        a.addActionListener(this);
        panel.addMouseMotionListener(this);
        // a.addMouseMotionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            System.out.println(fda);
            fda += 1;
            repaint();
        }
        // this.repaint();
    }


    public void paintComponent(Graphics g) {
        // add sliders later
        // super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 10, 10);
        g.fillOval(100, 100, 10, 10);
        System.out.println(x + " " + y);
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("hello there");
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println("drag");
        repaint();
    }
}
