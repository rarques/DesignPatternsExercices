package ex7;

/**
 * Created by rarques on 4/29/2017.
 */
public class SLI { // SLI = SalesLineItem

    private ProductDescription desc;
    private int quantity;

    public SLI(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }

    public int subTotal() {
        return desc.getPrice() * quantity;
    }

}