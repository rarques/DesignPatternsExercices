package examens.p1_rec_15_16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rarques on 6/2/2017.
 */
public class MachineComposite extends MachineComponent {

    private List<MachineComponent> components = new ArrayList<>();

    @Override
    public boolean isBroken() {
        return false;
    }

}
