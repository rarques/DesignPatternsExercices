package examens.p3_1rP_12_13;

import java.awt.*;

/**
 * Created by rarques on 6/4/2017.
 */
public abstract class Figure {

    private final float x;
    private final float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Builder create() {
        return new Builder();
    }

    private static class Builder {

        private float x, y, radius, x2, y2, width, height;
        private Color color;
        private boolean positionSet = false;
        private boolean radiusSet = false;
        private boolean dimensionsSet = false;
        private boolean secondPointSet = false;
        private boolean colorSet = false;

        public Builder at(float x, float y) {
            this.x = x;
            this.y = y;
            return this;
        }

        public Builder withDims(float width, float height) {
            this.width = width;
            this.height = height;
            return this;
        }

        public Builder from(float x, float y) {
            this.x = x;
            this.y = y;
            return this;
        }

        public Builder to(float x2, float y2) {
            this.x2 = x2;
            this.y2 = y2;
            return this;
        }

        public Builder in(Color color) {
            this.color = color;
            return this;
        }

        // the method can't be called do(), unexpected token
        public Figure execute() {
            if (isConflictiveFigure()) {
                return null;
            } else {
                if (radiusSet) {
                    return new Circle(x, y, radius);
                } else if (dimensionsSet && colorSet) {
                    return new ColorRectangle(x, y, width, height, color);
                } else if (dimensionsSet) {
                    return new Rectangle(x, y, width, height);
                } else {
                    return new Line(x, y, x2, y2);
                }
            }
        }

        private boolean isConflictiveFigure() {
            if (!positionSet) {
                return true;
            } else if (radiusSet && dimensionsSet) {
                return true;
            } else if ((positionSet && secondPointSet) &&
                    (radiusSet || dimensionsSet || colorSet)) {
                return true;
            } else {
                return false;
            }
        }

    }

}
