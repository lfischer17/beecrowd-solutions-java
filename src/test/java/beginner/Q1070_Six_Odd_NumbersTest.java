package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1070_Six_Odd_Numbers.sixOddNumbersToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1070_Six_Odd_NumbersTest {

    @Test
    void test1() {

        final int baseNumber = 3;

        final String actual = sixOddNumbersToFormattedString(baseNumber);
        final String expected = """
                3
                5
                7
                9
                11
                13""";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int baseNumber = 4;

        final String actual = sixOddNumbersToFormattedString(baseNumber);
        final String expected = """
                5
                7
                9
                11
                13
                15""";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int baseNumber = 10;

        final String actual = sixOddNumbersToFormattedString(baseNumber);
        final String expected = """
                11
                13
                15
                17
                19
                21""";

        assertEquals(expected, actual);
    }
}