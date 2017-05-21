package examens.p3_2nP_15_16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rarques on 5/21/2017.
 */
public class CreateFigureTest {

    @Test
    public void testCreateCircleWithCorrectMethods() {
        Circle circle = (Circle) Figure
                .create()
                .at(2.0, 1.0)
                .withRadius(0.5)
                .execute();
        assertEquals(0.5, circle.getRadius(), 0.001);
        assertEquals(2.0, circle.getX(), 0.001);
        assertEquals(1.0, circle.getY(), 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testCannotCreateCircleWithDimensions() {
        Circle circle = (Circle) Figure
                .create()
                .withRadius(1.0)
                .withDimensions(2.0, 2.0)
                .execute();
    }

    @Test
    public void testCreateCircleWithMultipleAtMethods() {
        Circle circle = (Circle) Figure
                .create()
                .at(1.0, 1.0)
                .at(2.0, 2.0)
                .withRadius(3.0)
                .execute();
        assertEquals(1.0, circle.getX(), 0.001);
        assertEquals(1.0, circle.getY(), 0.001);
    }

    @Test
    public void testCreateCircleWithMultipleRadius() {
        Circle circle = (Circle) Figure
                .create()
                .at(1.0, 1.0)
                .withRadius(3.0)
                .withRadius(2.0)
                .execute();
        assertEquals(2.0, circle.getRadius(), 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testCannotCreateCircleWithoutRadius() {
        Circle circle = (Circle) Figure
                .create()
                .at(1.0, 1.0)
                .execute();
    }

    @Test
    public void testCreateRectangleWithCorrectMethods() {
        Rectangle rectangle = (Rectangle) Figure
                .create()
                .at(1.0, 2.0)
                .withDimensions(5.0, 4.0)
                .execute();
        assertEquals(1.0, rectangle.getX(), 0.001);
        assertEquals(2.0, rectangle.getY(), 0.001);
        assertEquals(5.0, rectangle.getWidth(), 0.001);
        assertEquals(4.0, rectangle.getHeight(), 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testCannotCreateRectangleWithRadius() {
        Rectangle rectangle = (Rectangle) Figure
                .create()
                .at(1.0, 1.0)
                .withDimensions(2.0, 3.0)
                .withRadius(2.0)
                .execute();
    }

    @Test
    public void testCreateRectangleWithMultipleAtMethods() {
        Rectangle rectangle = (Rectangle) Figure
                .create()
                .at(1.0, 1.0)
                .at(2.0, 2.0)
                .withDimensions(3.0, 3.0)
                .execute();
        assertEquals(1.0, rectangle.getX(), 0.001);
        assertEquals(1.0, rectangle.getY(), 0.001);
    }

    @Test
    public void testCreateRectangleWithMultipleDimensions() {
        Rectangle rectangle = (Rectangle) Figure
                .create()
                .withDimensions(1.0, 1.0)
                .withDimensions(2.0, 3.0)
                .at(10.0, 10.0)
                .execute();
        assertEquals(2.0, rectangle.getWidth(), 0.001);
        assertEquals(3.0, rectangle.getHeight(), 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testCannotCreateFigureWithoutAtMethod() {
        Rectangle rectangle = (Rectangle) Figure
                .create()
                .withDimensions(1.0, 2.0)
                .execute();
    }

}