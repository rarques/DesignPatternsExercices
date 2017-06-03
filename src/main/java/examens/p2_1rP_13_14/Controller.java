package examens.p2_1rP_13_14;

public class Controller {

    private Resolution resolution;
    private AbstractFactory factory;
    private Document document;

    public Controller(Resolution resolution, Document document) {
        this.resolution = resolution;
        factory = AbstractFactory.createAbstractFactory(resolution);
        this.document = document;
    }

    public void visualize() {
        Visualizer visualizer = factory.createVisualizer();
        visualizer.visualize(document);
    }

    public void print() {
        Printer printer = factory.createPinter();
        printer.print(document);
    }

}
