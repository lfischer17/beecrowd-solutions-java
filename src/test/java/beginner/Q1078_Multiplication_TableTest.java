package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1078_Multiplication_Table.multiplicationTableToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1078_Multiplication_TableTest {

    @Test
    void test1() {

        final int number = 140;

        final String actual = multiplicationTableToFormattedString(number);
        final String expected = """
                1 x 140 = 140
                2 x 140 = 280
                3 x 140 = 420
                4 x 140 = 560
                5 x 140 = 700
                6 x 140 = 840
                7 x 140 = 980
                8 x 140 = 1120
                9 x 140 = 1260
                10 x 140 = 1400""";

        assertEquals(expected, actual);
    }
}