package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1133_Rest_of_a_Division.restOfADivisionNumbersToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1133_Rest_of_a_DivisionTest {

    @Test
    void test1() {

        final int baseNumber = 10;
        final int topNumber = 18;

        final String actual = restOfADivisionNumbersToFormattedString(baseNumber, topNumber);
        final String expected = """
                12
                13
                17""";

        assertEquals(expected, actual);
    }
}