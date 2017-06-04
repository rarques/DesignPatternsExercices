package examens.p2_1rP_12_13;

import java.util.Observable;

/**
 * Created by rarques on 6/4/2017.
 */
public abstract class Figure extends Observable{

    private float x;
    private float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        float previousX = this.x;
        this.x = x;
        if (x != previousX)
            notifyChanges();

    }

    public void setY(float y) {
        float previousY = this.y;
        this.y = y;
        if (y != previousY)
            notifyChanges();
    }

    protected void notifyChanges() {
        setChanged();
        notifyObservers();
    }

}
