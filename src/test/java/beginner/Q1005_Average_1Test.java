package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1005_Average_1.averageToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1005_Average_1Test {

    @Test
    void test1() {

        final double a = 5.0;
        final double b = 7.1;

        final String actual = averageToFormattedString(a, b);
        final String expected = "MEDIA = 6.43182";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final double a = 0.0;
        final double b = 7.1;

        final String actual = averageToFormattedString(a, b);
        final String expected = "MEDIA = 4.84091";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final double a = 10.0;
        final double b = 10.0;

        final String actual = averageToFormattedString(a, b);
        final String expected = "MEDIA = 10.00000";

        assertEquals(expected, actual);
    }
}