package examens.p2_1rP_13_14;

public class LowResolutionFactory extends AbstractFactory {
    @Override
    public Visualizer createVisualizer() {
        return new LowResVisualizer();
    }

    @Override
    public Printer createPinter() {
        return new LowResPrinter();
    }
}
