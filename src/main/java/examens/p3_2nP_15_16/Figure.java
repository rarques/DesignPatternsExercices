package examens.p3_2nP_15_16;

/**
 * Created by rarques on 5/21/2017.
 */
public abstract class Figure {

    private double x;
    private double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Builder create() {
        return new Builder();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
