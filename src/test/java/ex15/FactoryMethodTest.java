package ex15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rarques on 5/14/2017.
 */
public class FactoryMethodTest {

    @Test
    public void testStandardProduct() {
        ProductDescription description = new ProductDescription("Product 1",
                100,
                ProductDescription.STANDARD);
        int quantity = 2;
        SLI sli = SLIFactory.createSLI(description, quantity);
        assertEquals(200, sli.subTotal());
    }

    @Test
    public void testSpecialOfferProduct() {
        ProductDescription description = new ProductDescription("Product 2",
                100,
                ProductDescription.HALF_PRICE);
        int quantity = 2;
        SLI sli = SLIFactory.createSLI(description, quantity);
        assertEquals(100, sli.subTotal());
    }

}
