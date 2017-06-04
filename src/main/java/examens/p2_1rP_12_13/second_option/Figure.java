package examens.p2_1rP_12_13.second_option;

import java.util.Observer;

/**
 * Figure need to be observable but it is extending from another class
 */
public abstract class Figure extends OtherClass {

    private float x;
    private float y;
    private ObservableFigure observableFigure;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
        observableFigure = new ObservableFigure();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
        observableFigure.notifyChanges(this);
    }

    public void setY(float y) {
        this.y = y;
    }

    public void addObserver(Observer observer) {
        observableFigure.addObserver(observer);
    }
}
