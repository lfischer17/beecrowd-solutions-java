package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1132_Multiples_of_13.numbersNotMultipleByThirteenSumToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1132_Multiples_of_13Test {

    @Test
    void test1() {

        final int baseNumber = 100;
        final int topNumber = 200;

        final String actual = numbersNotMultipleByThirteenSumToFormattedString(baseNumber, topNumber);
        final String expected = "13954";

        assertEquals(expected, actual);
    }
}