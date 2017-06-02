package examens.p1_rec_15_16;

import java.util.Observable;
import java.util.Observer;

public class GraphicInterface implements Observer {

    protected boolean notified = false;

    @Override
    public void update(Observable o, Object arg) {
        notified = true;
    }

}
