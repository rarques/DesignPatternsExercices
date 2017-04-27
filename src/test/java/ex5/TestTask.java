package ex5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rarques on 4/27/2017.
 */
public class TestTask {

    @Test
    public void testWithSimpleTasks() {
        TaskComposite project = new TaskComposite();
        project.addSubtask(new SimpleTask(3, new Money(100)));
        project.addSubtask(new SimpleTask(4, new Money(300)));

        assertEquals(7, project.getDurationInDays());
        assertEquals(400.0, project.getCostInEuros().getCostInEuros(), 0.001);
    }

    @Test
    public void testWithConcurrentTasks() {
        TaskComposite project = new TaskComposite();
        project.addSubtask(new SimpleTask(3, new Money(100)));
        TaskCompositeConcurrent subProject = new TaskCompositeConcurrent();
        subProject.addSubtask(new SimpleTask(2, new Money(200)));
        subProject.addSubtask(new SimpleTask(2, new Money(300)));
        project.addSubtask(subProject);

        assertEquals(5, project.getDurationInDays());
        assertEquals(600.0, project.getCostInEuros().getCostInEuros(), 0.001);
    }

}
