package ex15;

/**
 * Created by rarques on 5/14/2017.
 */
public class SLIFactory {

    public static SLI createSLI(ProductDescription productDescription, int quantity) {
        if (is50PerCentOffer(productDescription)) {
            return new SLI50PerCent(productDescription, quantity);
        } else {
            return new SLIStandard(productDescription, quantity);
        }
    }

    private static boolean is50PerCentOffer(ProductDescription description) {
        return description.getType() == ProductDescription.HALF_PRICE;
    }
}
