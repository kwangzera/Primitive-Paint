import java.awt.*;

public class CreateEraser extends CreatePen {
    public CreateEraser() {
        super();
    }

    // If the global color set to white, then have to reset again, so temporary color created
    public Color fetchColor() {
        return Color.WHITE;
    }
}
