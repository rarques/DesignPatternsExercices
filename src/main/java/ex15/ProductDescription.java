package ex15;

/**
 * Created by rarques on 5/14/2017.
 */
public class ProductDescription {

    public static final int STANDARD = 1;
    public static final int HALF_PRICE = 2;

    private String description;
    private int price;
    private int type;

    public ProductDescription(String description, int price, int type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }



    public int getPrice() {
        return price;
    }

    public int getType() {
        return type;
    }
}
