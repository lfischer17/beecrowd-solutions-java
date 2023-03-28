package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1065_Even_Between_five_Numbers.evenBetweenFiveNumbersCountToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1065_Even_Between_five_NumbersTest {

    @Test
    void test1() {

        final int n1 = 7;
        final int n2 = -5;
        final int n3 = 6;
        final int n4 = -4;
        final int n5 = 12;

        final String actual = evenBetweenFiveNumbersCountToFormattedString(n1, n2, n3, n4, n5);
        final String expected = "3 valores pares";

        assertEquals(expected, actual);
    }
}