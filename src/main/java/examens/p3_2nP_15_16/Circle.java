package examens.p3_2nP_15_16;

/**
 * Created by rarques on 5/21/2017.
 */
public class Circle extends Figure {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
