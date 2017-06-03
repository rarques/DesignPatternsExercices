package examens.p2_1rP_13_14;

public class HiResolutionFactory extends AbstractFactory {
    @Override
    public Visualizer createVisualizer() {
        return new HiResVisualizer();
    }

    @Override
    public Printer createPinter() {
        return new HiResPrinter();
    }
}
