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

    @Override
    public void setBroken() {
        setBrokenAndNotify(true);
    }

    @Override
    public void repair() {
        setBrokenAndNotify(false);
    }

    private void setBrokenAndNotify(boolean newBroken) {
        boolean wasBroken = broken;
        broken = newBroken;
        if (wasBroken != broken)
            notifyChanges();
    }

    private void notifyChanges() {
        setChanged();
        notifyObservers();
    }

}
