package examens.p1_rec_15_16;

/**
 * Created by rarques on 6/2/2017.
 */
public class Machine extends MachineComponent {

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public void setBroken() {
        changeBrokenAndNotify(true);
    }

    @Override
    public void repair() {
        changeBrokenAndNotify(false);
    }

}
