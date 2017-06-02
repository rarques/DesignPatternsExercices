package examens.p1_rec_15_16;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rarques on 6/2/2017.
 */
public class MachineCompositeTest {

    private GraphicInterface graphicInterface;

    @Before
    public void setUp() throws Exception {
        graphicInterface = new GraphicInterface();
    }

    @Test
    public void test_observerNotifiedWhenCompositeBreaks() {
        MachineComposite workingComposite = createWorkingComposite();
        workingComposite.addObserver(graphicInterface);
        workingComposite.setBroken();
        assertTrue(graphicInterface.notified);
    }

    @Test
    public void test_observerNotifiedWhenBrokenCompositeIsRepaired() {
        MachineComposite brokenComposite = createBrokenComposite();
        brokenComposite.addObserver(graphicInterface);
        brokenComposite.repair();
        assertTrue(graphicInterface.notified);
    }

    @Test
    public void test_compositeWithWorkingComponentsIsNotBroken() {
        MachineComposite composite = new MachineComposite();
        List<Machine> workingMachines = createWorkingMachines();
        addComponents(composite, workingMachines);
        assertFalse(composite.isBroken());
    }

    @Test
    public void test_compositeWithBrokenComponentsIsBroken() {
        MachineComposite composite = new MachineComposite();
        Machine brokenMachine = createBrokenMachine();
        composite.addComponent(brokenMachine);
        assertTrue(composite.isBroken());
    }

    @Test
    public void test_observerNotifiedWhenBrokenComponentIsAdded() {
        MachineComposite composite = new MachineComposite();
        composite.addObserver(graphicInterface);
        composite.addComponent(createBrokenMachine());
        assertTrue(graphicInterface.notified);
    }

    private List<Machine> createWorkingMachines() {
        return Arrays.asList(new Machine(),
                new Machine(),
                new Machine());
    }

    private void addComponents(MachineComposite composite, List<Machine> workingMachines) {
        for (Machine machine : workingMachines) {
            composite.addComponent(machine);
        }
    }

    private MachineComposite createWorkingComposite() {
        return new MachineComposite();
    }

    private MachineComposite createBrokenComposite() {
        MachineComposite brokenComposite = createWorkingComposite();
        brokenComposite.setBroken();
        return brokenComposite;
    }

    private Machine createBrokenMachine() {
        Machine brokenMachine = new Machine();
        brokenMachine.setBroken();
        return brokenMachine;
    }

}