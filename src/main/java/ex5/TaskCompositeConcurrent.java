package ex5;

import java.util.List;

/**
 * Created by rarques on 4/27/2017.
 */
public class TaskCompositeConcurrent extends TaskComposite {

    public TaskCompositeConcurrent() {
    }

    public TaskCompositeConcurrent(List<Task> tasks) {
        super(tasks);
    }

    @Override
    public int getDurationInDays() {
        List<Task> subTasks = super.getSubTasks();
        int duration = 0;
        for (Task t : subTasks) {
            int taskDuration = t.getDurationInDays();
            if (taskDuration > duration)
                duration = taskDuration;
        }
        return duration;
    }

}
