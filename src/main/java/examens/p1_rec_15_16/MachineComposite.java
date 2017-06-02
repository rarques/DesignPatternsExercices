package examens.p1_rec_15_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by rarques on 6/2/2017.
 */
public class MachineComposite extends MachineComponent implements Observer {

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
        component.addObserver(this);
        if (component.isBroken())
            notifyChanges();
    }

    @Override
    public void update(Observable o, Object arg) {
        changeBrokenAndNotify(true);
    }
}
