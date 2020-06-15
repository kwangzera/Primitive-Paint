import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

// public class Pen extends Tool {
//     public Pen(Canvas canvas) {
//         super(canvas);
//     }

//     public void draw(Graphics g) {
//         g.setColor(Color.RED);
//         // System.out.println(panel.getMouseX() + " " + panel.getMouseY());
//         g.fillOval(canvas.getMouseX(), canvas.getMouseY(), 10, 10);
// 		g.fillOval(100, 100, 10, 10);
// 		// g.drawImage(MyPanel.paintImage, 0, 0, null);
//     }
// }

public class Pen extends Tool implements Mouse {
    private boolean flag = true;
    // private Pen pen1 = new Pen(this);
    // private Eraser eraser1 = new Eraser(this);
    // private Tool currentTool = pen1;
    public static int x1 = -10, y1 = -10;
    public static int x2 = -10, y2 = -10;

    public Pen() {

    }

    public void mouseDrag(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        // strokes.remove(strokes.size() - 1);
        strokes.add(new InfoPen(x1, x2, y1, y2));
        x1 = x2;
        y1 = y2;
        System.out.println(x2 + ", " + y2);
    }
    
    public void mouseUp(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        // strokes.remove(strokes.size() - 1);
        // strokes.add(new InfoPen(x1, x2, y1, y2));
        System.out.println("click 1 success");
    }

    public void mouseDown(ArrayList<InfoTool> strokes, MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        // this.y1 = this.y2 = event.getY();
        // strokes.add(new InfoPen(x1, x2, y1, y2));
        System.out.println("click 2 success");
    }

    public void test() {
        System.out.println("success");
    }
}