package ex6;

import java.awt.*;

/**
 * Created by rarques on 4/29/2017.
 */
public class ColorRectangle extends Rectangle {

    private Color color;

    public ColorRectangle(float x, float y, float width, float height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }

    public ColorRectangle(ColorRectangle other) {
        super(other);
        this.color = other.color;
    }

    @Override
    public ColorRectangle copy() {
        return new ColorRectangle(this);
    }

    @Override
    public ColorRectangle deepCopy() {
        return copy();
    }
}
