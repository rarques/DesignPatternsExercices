package examens.p3_2nP_15_16;

/**
 * Created by rarques on 5/21/2017.
 */
public class Builder {

    private double x;
    private double y;
    private double width;
    private double height;
    private double radius;
    private boolean positionSet = false;
    private boolean radiusSet = false;
    private boolean dimensionsSet = false;

    public Builder at(double x, double y) {
        if (!positionSet) {
            this.x = x;
            this.y = y;
            positionSet = true;
        }
        return this;
    }

    public Builder withDimensions(double width, double height) {
        if (radiusSet)
            throw new IllegalStateException();
        this.width = width;
        this.height = height;
        dimensionsSet = true;
        return this;
    }

    public Builder withRadius(double radius) {
        if (dimensionsSet)
            throw new IllegalStateException();
        this.radius = radius;
        radiusSet = true;
        return this;
    }

    public Figure execute() {
        if (!positionSet)
            throw new IllegalStateException("Position not set");
        if (radiusSet) {
            return new Circle(x, y, radius);
        } else if (dimensionsSet) {
            return new Rectangle(x, y, width, height);
        } else {
            throw new IllegalStateException("Radius or dimensions not defined");
        }
    }

}
