package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1006_Average_2.averageToFormattedString;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1006_Average_2Test {

    @Test
    void test1() {

        final double a = 5.0;
        final double b = 6.0;
        final double c = 7.0;

        final String actual = averageToFormattedString(a, b, c);
        final String expected = "MEDIA = 6.3";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final double a = 5.0;
        final double b = 10.0;
        final double c = 10.0;

        final String actual = averageToFormattedString(a, b, c);
        final String expected = "MEDIA = 9.0";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final double a = 10.0;
        final double b = 10.0;
        final double c = 5.0;

        final String actual = averageToFormattedString(a, b, c);
        final String expected = "MEDIA = 7.5";

        assertEquals(expected, actual);
    }
}