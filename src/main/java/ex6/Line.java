package ex6;

/**
 * Created by rarques on 4/29/2017.
 */
public class Line extends Figure {

    private float x2;
    private float y2;

    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Line other) {
        super(other);
        this.x2 = other.x2;
        this.y2 = other.y2;
    }

    @Override
    public Line copy() {
        return new Line(this);
    }

    @Override
    public Line deepCopy() {
        return copy();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (Float.compare(line.x2, x2) != 0) return false;
        return Float.compare(line.y2, y2) == 0;
    }

    @Override
    public int hashCode() {
        int result = (x2 != +0.0f ? Float.floatToIntBits(x2) : 0);
        result = 31 * result + (y2 != +0.0f ? Float.floatToIntBits(y2) : 0);
        return result;
    }
}
