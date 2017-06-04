package examens.p2_1rP_12_13.second_option;

import java.util.Observable;

/**
 * Created by rarques on 6/4/2017.
 */
public class ObservableFigure extends Observable {

    protected void notifyChanges(Figure modifiedFigure) {
        setChanged();
        notifyObservers(modifiedFigure);
    }

}
