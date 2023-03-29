package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1071_Sum_of_Consecutive_Odd_Numbers_I.sumOfConsecutiveOddNumbersToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1071_Sum_of_Consecutive_Odd_Numbers_ITest {

    @Test
    void test1() {

        final int topNumber = 6;
        final int baseNumber = -5;

        final String actual = sumOfConsecutiveOddNumbersToFormattedString(topNumber, baseNumber);
        final String expected = "5";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int topNumber = 15;
        final int baseNumber = 12;

        final String actual = sumOfConsecutiveOddNumbersToFormattedString(topNumber, baseNumber);
        final String expected = "13";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int topNumber = 12;
        final int baseNumber = 12;

        final String actual = sumOfConsecutiveOddNumbersToFormattedString(topNumber, baseNumber);
        final String expected = "0";

        assertEquals(expected, actual);
    }
}