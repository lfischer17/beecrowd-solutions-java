package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1067_Odd_Numbers.oddNumbersToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1067_Odd_NumbersTest {

    @Test
    void test1() {

        final int limit = 3;

        final String actual = oddNumbersToFormattedString(limit);
        final String expected = """
                1
                3""";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int limit = 4;

        final String actual = oddNumbersToFormattedString(limit);
        final String expected = """
                1
                3""";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int limit = 10;

        final String actual = oddNumbersToFormattedString(limit);
        final String expected = """
                1
                3
                5
                7
                9""";

        assertEquals(expected, actual);
    }
}