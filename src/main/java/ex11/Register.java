package ex11;

import java.util.Hashtable;

/**
 * Singleton class with Eager initialization
 */
public class Register {

    public static Register INSTANCE = new Register();

    private Hashtable<String, Figure> figures;

    private Register() {
        figures = new Hashtable<>();
    }

    public void addFigure(String name, Figure figure) {
        figures.put(name, figure);
    }

    public Figure recoverFigure(String name) {
        return figures.get(name);
    }

}
