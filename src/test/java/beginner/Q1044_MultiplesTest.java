package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1044_Multiples.isMultipleToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1044_MultiplesTest {

    @Test
    void test1() {

        final int a = 6;
        final int b = 24;

        final String actual = isMultipleToFormattedString(a, b);
        final String expected = "Sao Multiplos";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int a = 6;
        final int b = 25;

        final String actual = isMultipleToFormattedString(a, b);
        final String expected = "Nao sao Multiplos";

        assertEquals(expected, actual);
    }
}