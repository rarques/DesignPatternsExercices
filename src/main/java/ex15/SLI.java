package ex15;

/**
 * Created by rarques on 5/14/2017.
 */
public abstract class SLI {

    protected ProductDescription description;
    protected int quantity;

    public SLI(ProductDescription description, int quantity) {
        this.description = description;
        this.quantity = quantity;
    }

    public abstract int subTotal();
}
