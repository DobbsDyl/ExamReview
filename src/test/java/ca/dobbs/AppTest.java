package ca.dobbs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testArea() {
        assertEquals(App.calculateArea(2, 2, false), 4);
    }

    @Test
    public void testTriangleArea() {
        assertEquals(App.calculateArea(2, 2, true), 2);
    }
}
