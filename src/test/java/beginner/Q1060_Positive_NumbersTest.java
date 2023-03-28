package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1060_Positive_Numbers.positiveNumberCountToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1060_Positive_NumbersTest {

    @Test
    void test1() {

        final double n1 = 7;
        final double n2 = -5;
        final double n3 = 6;
        final double n4 = -3.4;
        final double n5 = 4.6;
        final double n6 = 12;

        final String actual = positiveNumberCountToFormattedString(n1, n2, n3, n4, n5, n6);
        final String expected = "4 valores positivos";

        assertEquals(expected, actual);
    }
}