package ex16;

/**
 * Created by rarques on 5/14/2017.
 */
public class DoubleDispatch {

    public static void main(String[] args) {

        A a1 = new A("A1");
        A a2 = new A("A2");
        B b1 = new B("B1");

        a1.operation(a2);
        a1.operation(b1);

    }

}
