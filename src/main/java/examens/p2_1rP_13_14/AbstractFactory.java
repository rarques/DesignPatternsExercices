package examens.p2_1rP_13_14;

public abstract class AbstractFactory {

    public static AbstractFactory createAbstractFactory(Resolution resolution) {
        if (resolution == Resolution.HI) {
            return new HiResolutionFactory();
        //} else if (resolution == Resolution.Mid) { // Other resolution types
        //    return new MidResolutionFactory();
        } else {
            return new LowResolutionFactory();
        }
    }

    public abstract Visualizer createVisualizer();

    public abstract Printer createPinter();

}
