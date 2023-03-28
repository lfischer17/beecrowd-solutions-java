package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1059_Even_Numbers.evenNumbersToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1059_Even_NumbersTest {

    @Test
    void test1() {

        final int limit = 3;

        final String actual = evenNumbersToFormattedString(limit);
        final String expected = """
                2""";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int limit = 4;

        final String actual = evenNumbersToFormattedString(limit);
        final String expected = """
                2
                4""";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int limit = 10;

        final String actual = evenNumbersToFormattedString(limit);
        final String expected = """
                2
                4
                6
                8
                10""";

        assertEquals(expected, actual);
    }
}