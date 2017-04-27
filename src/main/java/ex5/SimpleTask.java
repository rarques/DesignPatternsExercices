package ex5;

/**
 * Created by rarques on 4/27/2017.
 */
public class SimpleTask implements Task {

    private int durationIndays;
    private Money costInEuros;

    public SimpleTask(int durationIndays, Money costInEuros) {
        this.durationIndays = durationIndays;
        this.costInEuros = costInEuros;
    }

    @Override
    public int getDurationInDays() {
        return durationIndays;
    }

    @Override
    public Money getCostInEuros() {
        return costInEuros;
    }
    
}
