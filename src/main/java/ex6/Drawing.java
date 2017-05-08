package ex6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rarques on 4/29/2017.
 */
public class Drawing extends Figure {

    private List<Figure> figures = new ArrayList<>();

    public Drawing(float x, float y) {
        super(x, y);
        this.figures = figures;
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    @Override
    public Figure copy() {
        return null;
    }

    @Override
    public Figure deepCopy() {
        return null;
    }
}
