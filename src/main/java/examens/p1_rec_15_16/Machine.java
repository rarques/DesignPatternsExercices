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
        boolean wasBroken = broken;
        broken = true;
        if (wasBroken != broken)
            notifyChanges();
    }

    private void notifyChanges() {
        setChanged();
        notifyObservers();
    }

}
