package examens.p1_rec_15_16;

/**
 * Created by rarques on 6/2/2017.
 */
public class Machine extends MachineComponent {

    private boolean broken = false;

    @Override
    public boolean isBroken() {
        return false;
    }

    public void setBroken() {
        changeBrokenAndNotify(true);
    }

    private void changeBrokenAndNotify(boolean newBroken) {
        boolean wasBroken = broken;
        broken = newBroken;
        if (wasBroken != broken)
            notifyChanges();
    }

    public void repair() {
        changeBrokenAndNotify(false);
    }

    private void notifyChanges() {
        setChanged();
        notifyObservers();
    }

}
