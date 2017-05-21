package examens.p3_2nP_15_16;

/**
 * Created by rarques on 5/21/2017.
 */
public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
