package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1015_Distance_Between_Two_Points.distanceToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1015_Distance_Between_Two_PointsTest {

    @Test
    void test1() {

        final double x1 = 1.0;
        final double y1 = 7.0;
        final double x2 = 5.0;
        final double y2 = 9.0;

        final String actual = distanceToFormattedString(x1, y1, x2, y2);
        final String expected = "4.4721";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final double x1 = -2.5;
        final double y1 = 0.4;
        final double x2 = 12.1;
        final double y2 = 7.3;

        final String actual = distanceToFormattedString(x1, y1, x2, y2);
        final String expected = "16.1484";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final double x1 = 2.5;
        final double y1 = -0.4;
        final double x2 = -12.2;
        final double y2 = 7.0;

        final String actual = distanceToFormattedString(x1, y1, x2, y2);
        final String expected = "16.4575";

        assertEquals(expected, actual);
    }
}