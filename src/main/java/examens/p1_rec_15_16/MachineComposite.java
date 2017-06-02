package examens.p1_rec_15_16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rarques on 6/2/2017.
 */
public class MachineComposite extends MachineComponent {

    private List<MachineComponent> components = new ArrayList<>();

    @Override
    public void setBroken() {
        changeBrokenAndNotify(true);
    }

    @Override
    public void repair() {
        changeBrokenAndNotify(false);
    }

    @Override
    public boolean isBroken() {
        for (MachineComponent component : components) {
            if (component.isBroken())
                return true;
        }
        return broken;
    }

    public void addComponent(MachineComponent component) {
        components.add(component);
        if (component.isBroken())
            notifyChanges();
    }

}
