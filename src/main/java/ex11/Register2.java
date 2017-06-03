package ex11;

import java.util.Hashtable;

/**
 * Singleton class with lazy initialization
 */
public class Register2 {

    private static Register2 instance;

    private Hashtable<String, Figure> figures;

    private Register2() {
        figures = new Hashtable<>();
    }

    public Register2 getInstance() {
        if (instance == null) {
            instance = new Register2();
        }
        return instance;
    }

    public void addFigure(String name, Figure figure) {
        figures.put(name, figure);
    }

    public void recoverFigure(String name) {
        figures.get(name);
    }

}
