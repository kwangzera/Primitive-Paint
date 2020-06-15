import java.util.ArrayList;
import java.awt.event.*;

public interface Mouse {
    void mouseDrag(ArrayList<InfoTool> strokes, MouseEvent event);
    void mouseUp(ArrayList<InfoTool> strokes, MouseEvent event);
    void mouseDown(ArrayList<InfoTool> strokes, MouseEvent event);
    void test();
}
