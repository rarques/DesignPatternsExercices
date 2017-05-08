package ex6;

/**
 * Created by rarques on 4/29/2017.
 */
public class Rectangle extends Figure {

    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other) {
        super(other);
        this.width = other.width;
        this.height = other.height;
    }

    @Override
    public Rectangle copy() {
        return new Rectangle(this);
    }

    @Override
    public Rectangle deepCopy() {
        return copy();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Float.compare(rectangle.width, width) != 0) return false;
        return Float.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = (width != +0.0f ? Float.floatToIntBits(width) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        return result;
    }
}
