package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rarques on 4/27/2017.
 */
public class TaskComposite implements Task {

    private List<Task> subTasks;

    public TaskComposite() {
        subTasks = new ArrayList<>();
    }

    public TaskComposite(List<Task> tasks) {
        subTasks = tasks;
    }

    public void addSubtask(Task subTask) {
        subTasks.add(subTask);
    }

    @Override
    public int getDurationInDays() {
        int duration = 0;
        for (Task t : subTasks) {
            duration += t.getDurationInDays();
        }
        return duration;
    }

    @Override
    public Money getCostInEuros() {
        Money cost = new Money(0);
        for (Task t : subTasks) {
            cost.add(t.getCostInEuros());
        }
        return cost;
    }

    public List<Task> getSubTasks() {
        return subTasks;
    }

}
