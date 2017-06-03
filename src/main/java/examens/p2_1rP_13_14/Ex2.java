package examens.p2_1rP_13_14;

public class Ex2 {

    public static void main(String[] args) {

        Controller hiResolutionController = new Controller(Resolution.HI, new Document());
        hiResolutionController.visualize();
        hiResolutionController.print();

        System.out.println();

        Controller lowResolutionController = new Controller(Resolution.LOW, new Document());
        lowResolutionController.visualize();
        lowResolutionController.print();

    }

}
