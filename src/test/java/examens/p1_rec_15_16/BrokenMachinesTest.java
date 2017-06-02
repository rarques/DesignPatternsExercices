package examens.p1_rec_15_16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rarques on 6/2/2017.
 */
public class BrokenMachinesTest {

    private GraphicInterface graphicInterface;

    @Before
    public void setUp() throws Exception {
        graphicInterface = new GraphicInterface();
    }

    @Test
    public void test_ObserverIsNotifiedWhenMachineBreaks() {
        Machine machine = createWorkingMachine();
        machine.addObserver(graphicInterface);
        machine.setBroken();
        assertTrue(graphicInterface.notified);
    }

    @Test
    public void test_observerIsNotNotifiedIfStateDoesNotChange() {
        Machine brokenMachine = createBrokenMachine();
        brokenMachine.addObserver(graphicInterface);
        brokenMachine.setBroken();
        assertFalse(graphicInterface.notified);
    }

    @Test
    public void test_observerIsNotifiedWhenBrokenMachineIsRepaired() {
        Machine brokenMachine = createBrokenMachine();
        brokenMachine.addObserver(graphicInterface);
        brokenMachine.repair();
        assertTrue(graphicInterface.notified);
    }

    @Test
    public void test_observerNotNotifiedWhenWorkingMachineIsRepaired() {
        Machine workingMachine = createWorkingMachine();
        workingMachine.addObserver(graphicInterface);
        workingMachine.repair();
        assertFalse(graphicInterface.notified);
    }

    private Machine createWorkingMachine() {
        return new Machine();
    }

    private Machine createBrokenMachine() {
        Machine machine = createWorkingMachine();
        machine.setBroken();
        return machine;
    }

}

