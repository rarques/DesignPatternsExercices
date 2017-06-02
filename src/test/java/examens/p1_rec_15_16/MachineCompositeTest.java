package examens.p1_rec_15_16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rarques on 6/2/2017.
 */
public class MachineCompositeTest {

    @Test
    public void test_observerNotifiedWhenCompositeBreaks() {
        MachineComposite composite = new MachineComposite();
        GraphicInterface graphicInterface = new GraphicInterface();
        composite.addObserver(graphicInterface);
        composite.setBroken();
        assertTrue(graphicInterface.notified);
    }

}