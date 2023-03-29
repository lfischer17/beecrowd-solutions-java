package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1073_Even_Square.evenSquareToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1073_Even_SquareTest {

    @Test
    void test1() {

        final int topNumber = 6;

        final String actual = evenSquareToFormattedString(topNumber);
        final String expected = """
                2^2 = 4
                4^2 = 16
                6^2 = 36""";

        assertEquals(expected, actual);
    }
}