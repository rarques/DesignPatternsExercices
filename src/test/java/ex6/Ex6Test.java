package ex6;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by rarques on 4/29/2017.
 */
public class Ex6Test {

    @Test
    public void testCopiedRectangleHasSameHashCode() {
        Rectangle rect = new Rectangle(2, 3, 4, 5);
        Rectangle copiedRect = rect.copy();
        assertEquals(rect.hashCode(), copiedRect.hashCode());
    }

    @Test
    public void testCopiedCircleHasSameHashcode() {
        Circle circle = new Circle(2, 3, 1);
        Circle copiedCircle = circle.copy();
        assertEquals(circle.hashCode(), copiedCircle.hashCode());
    }

    @Test
    public void testCopiedLineHasSameHashcode() {
        Line line = new Line(1, 2, 2, 1);
        Line copiedLine = line.copy();
        assertEquals(line.hashCode(), copiedLine.hashCode());
    }

    @Test
    public void testCopiedColorRectangleHasSameHashCode() {
        ColorRectangle cRect = new ColorRectangle(1,2,3,4, Color.BLACK);
        ColorRectangle copiedCRect = cRect.copy();
        assertEquals(cRect.hashCode(), copiedCRect.hashCode());
    }

}
