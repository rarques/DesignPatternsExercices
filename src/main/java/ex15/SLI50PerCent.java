package ex15;

/**
 * Created by rarques on 5/14/2017.
 */
public class SLI50PerCent extends SLI {

    public SLI50PerCent(ProductDescription description, int quantity) {
        super(description, quantity);
    }

    @Override
    public int subTotal() {
        return description.getPrice() * quantity / 2;
    }
}
