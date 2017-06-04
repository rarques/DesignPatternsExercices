package examens.p2_1rP_12_13.second_option;

/**
 * Created by rarques on 6/4/2017.
 */
public class Circle extends Figure {

    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
