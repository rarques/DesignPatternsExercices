package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by rarques on 4/29/2017.
 */
public class Sale extends Observable {

    private List<SLI> lines = new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
        setChanged();
        notifyObservers();
    }

    public void createSalesLineItemPush(SLI sli) {
        lines.add(sli);
        setChanged();
        notifyObservers(sli);
    }

    public SLI getLastItem() {
        return lines.get(lines.size() - 1);
    }

}