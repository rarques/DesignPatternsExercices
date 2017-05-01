package ex7;

import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

import static org.junit.Assert.*;

/**
 * Created by rarques on 4/29/2017.
 */
public class Ex7Test {

    @Test
    public void guiIsNotifiedWhenSaleLineItemIsAdded() {

        GUIMockPull gui = new GUIMockPull();
        Sale sale = new Sale();
        sale.addObserver(gui);

        assertFalse(gui.notified);
        sale.createSalesLineItem(new ProductDescription("Product 1", 15), 1);
        assertTrue(gui.notified);

    }

    @Test
    public void whenItemIsAddedGuiReceivesItem() {

        GUIMockPush gui = new GUIMockPush();
        Sale sale = new Sale();
        sale.addObserver(gui);

        SLI item = new SLI(new ProductDescription("Product 1", 15), 2);
        SLI item2 = new SLI(new ProductDescription("Product 2", 20), 2);
        sale.createSalesLineItemPush(item);
        sale.createSalesLineItemPush(item2);
        assertEquals(item2, gui.lastItem);
        System.out.println(gui.lastItem.subTotal());

    }

}

class GUIMockPull implements Observer {

    protected boolean notified = false;

    @Override
    public void update(Observable o, Object arg) {
        notified = true;
    }
}

class GUIMockPush implements Observer {

    protected SLI lastItem;

    @Override
    public void update(Observable o, Object arg) {
        SLI newItem = (SLI) arg;
        lastItem = newItem;
    }
}