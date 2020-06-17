import java.awt.*;

public class CreateEraser extends CreatePen {
    public CreateEraser() {
        super();
    }

    // Can't directly set the global colour to be white, so temporary color created
    public Color fetchColor() {
        return Color.WHITE;
    }
}
