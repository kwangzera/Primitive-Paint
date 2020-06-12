import java.awt.*;

public abstract class Tool {
	MyPanel panel;
	public abstract void draw(Graphics g);

    public Tool(MyPanel panel) {
        this.panel = panel;
    }
}
