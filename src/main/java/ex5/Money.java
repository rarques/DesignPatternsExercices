package ex5;

/**
 * Created by rarques on 4/27/2017.
 */
public class Money {

    private double costInEuros;

    public Money(double costInEuros) {
        this.costInEuros = costInEuros;
    }

    public double getCostInEuros() {
        return costInEuros;
    }

    public void setCostInEuros(double costInEuros) {
        this.costInEuros = costInEuros;
    }

    public void add(Money costInEuros) {
        this.costInEuros += costInEuros.getCostInEuros();
    }

    @Override
    public String toString() {
        return "" + costInEuros;
    }

}
