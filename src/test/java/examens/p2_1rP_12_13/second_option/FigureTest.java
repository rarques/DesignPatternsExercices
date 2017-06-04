package examens.p2_1rP_12_13.second_option;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rarques on 6/4/2017.
 */
public class FigureTest {

    private FigureObserver figureObserver;

    @Before
    public void setUp() throws Exception {
        figureObserver = new FigureObserver();
    }

    @Test
    public void test_observerNotifiedWhenPropertyChanged() {
        Circle circle = new Circle(1, 2, 3);
        circle.addObserver(figureObserver);
        float newX = 4;
        circle.setX(newX);
        assertEquals(newX, figureObserver.modifiedFigure.getX(), 0.000001);
    }

}

class FigureObserver implements Observer {

    Figure modifiedFigure;

    @Override
    public void update(Observable o, Object arg) {
        modifiedFigure = (Figure) arg;
    }

}