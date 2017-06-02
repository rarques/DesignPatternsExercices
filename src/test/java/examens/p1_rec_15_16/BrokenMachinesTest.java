package examens.p1_rec_15_16;

import org.junit.Test;

import javax.crypto.Mac;
import java.util.Observable;
import java.util.Observer;

import static org.junit.Assert.*;

/**
 * Created by rarques on 6/2/2017.
 */
public class BrokenMachinesTest {

    @Test
    public void test_ObserverIsNotifiedWhenMachineBreaks() {
        GraphicInterface graphicInterface = new GraphicInterface();
        Machine machine = new Machine();
        machine.addObserver(graphicInterface);
        machine.setBroken();
        assertTrue(graphicInterface.notified);
    }

    @Test
    public void test_observerIsNotNotifiedIfStateDoesNotChange() {
        GraphicInterface graphicInterface = new GraphicInterface();
        Machine machine = new Machine();
        machine.setBroken();
        machine.addObserver(graphicInterface);
        machine.setBroken();
        assertFalse(graphicInterface.notified);
    }

}

class GraphicInterface implements Observer {

    protected boolean notified = false;

    @Override
    public void update(Observable o, Object arg) {
        notified = true;
    }

}