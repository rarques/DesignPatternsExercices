package examens.p3_1rP_12_13;

/**
 * Created by rarques on 6/4/2017.
 */
public class Line extends Figure {

    private final float x2;
    private final float y2;

    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }
}
