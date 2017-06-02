package examens.p1_rec_15_16;

import java.util.Observable;

/**
 * Created by rarques on 6/2/2017.
 */
public abstract class MachineComponent extends Observable {

    protected boolean broken;

    public void setBroken() {
        broken = true;
    }

    public void repair() {
        broken = false;
    }

    public abstract boolean isBroken();

}
