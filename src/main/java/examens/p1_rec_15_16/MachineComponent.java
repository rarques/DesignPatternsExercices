package examens.p1_rec_15_16;

import java.util.Observable;

/**
 * Created by rarques on 6/2/2017.
 */
public abstract class MachineComponent extends Observable {

    protected boolean broken;

    public abstract void setBroken();

    public abstract void repair();

    public abstract boolean isBroken();

    protected void changeBrokenAndNotify(boolean newBroken) {
        boolean wasBroken = broken;
        broken = newBroken;
        if (wasBroken != broken)
            notifyChanges();
    }

    protected void notifyChanges() {
        setChanged();
        notifyObservers();
    }
}
