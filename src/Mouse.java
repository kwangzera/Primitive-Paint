import java.awt.event.*;
import java.util.ArrayList;

public interface Mouse {
    void mouseDrag(ArrayList<InfoTool> strokes, MouseEvent event);
    void mouseUp(ArrayList<InfoTool> strokes, MouseEvent event);
    void mouseDown(ArrayList<InfoTool> strokes, MouseEvent event);
}
