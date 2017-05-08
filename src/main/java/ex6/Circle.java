package ex6;

/**
 * Created by rarques on 4/29/2017.
 */
public class Circle extends Figure {

    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(Circle other) {
        super(other);
        this.radius = other.radius;
    }

    @Override
    public Circle copy() {
        return new Circle(this);
    }

    @Override
    public Figure deepCopy() {
        return copy();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Float.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return (radius != +0.0f ? Float.floatToIntBits(radius) : 0);
    }
}
