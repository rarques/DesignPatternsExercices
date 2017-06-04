package examens.p3_1rP_12_13;

import java.awt.*;

/**
 * Created by rarques on 6/4/2017.
 */
public class ColorRectangle extends Rectangle {

    private final Color color;

    public ColorRectangle(float x, float y, float width, float height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }
}
