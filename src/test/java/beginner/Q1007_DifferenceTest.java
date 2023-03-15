package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1007_Difference.differenceToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1007_DifferenceTest {

    @Test
    void test1() {

        final int a = 5;
        final int b = 6;
        final int c = 7;
        final int d = 8;

        final String actual = differenceToFormattedString(a, b, c, d);
        final String expected = "DIFERENCA = -26";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int a = 0;
        final int b = 0;
        final int c = 7;
        final int d = 8;

        final String actual = differenceToFormattedString(a, b, c, d);
        final String expected = "DIFERENCA = -56";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int a = 5;
        final int b = 6;
        final int c = -7;
        final int d = 8;

        final String actual = differenceToFormattedString(a, b, c, d);
        final String expected = "DIFERENCA = 86";

        assertEquals(expected, actual);
    }
}