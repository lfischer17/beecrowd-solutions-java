package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1041_Coordinates_of_a_Point.coordinateToQuadrantString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1041_Coordinates_of_a_PointTest {

    @Test
    void test1() {

        final double x = 4.5;
        final double y = -2.2;

        final String actual = coordinateToQuadrantString(x, y);
        final String expected = "Q4";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final double x = 0.1;
        final double y = 0.1;

        final String actual = coordinateToQuadrantString(x, y);
        final String expected = "Q1";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final double x = 0.0;
        final double y = 0.0;

        final String actual = coordinateToQuadrantString(x, y);
        final String expected = "Origem";

        assertEquals(expected, actual);
    }
}