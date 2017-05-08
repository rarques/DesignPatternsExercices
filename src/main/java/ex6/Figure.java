package ex6;

/**
 * Created by rarques on 4/29/2017.
 */
public abstract class Figure {

    private float x;
    private float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Figure(Figure other) {
        this.x = other.x;
        this.y = other.y;
    }

    public abstract Figure copy();

    public abstract Figure deepCopy();

}
