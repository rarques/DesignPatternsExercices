package ex16;

/**
 * Created by rarques on 5/14/2017.
 */
public class A implements Common {

    private String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public void operation(Common other) {
        other.operationWithA(this);
    }

    @Override
    public void operationWithA(Common other) {
        System.out.println(this + " operation with: " + other);
    }

    @Override
    public void operationWithB(Common other) {
        System.out.println(this + " operation with: " + other);
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
