package ex15;

/**
 * Created by rarques on 5/14/2017.
 */
public class SLIFactory {

    public static SLI createSLI(ProductDescription description, int quantity) {
        if (description.getType() == ProductDescription.HALF_PRICE) {
            return new SLI50PerCent(description, quantity);
        } else {
            return new SLIStandard(description, quantity);
        }
    }
}
