package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1064_Positives_and_Average.positiveAndAverageToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1064_Positives_and_AverageTest {

    @Test
    void test1() {

        final double n1 = 7;
        final double n2 = -5;
        final double n3 = 6;
        final double n4 = -3.4;
        final double n5 = 4.6;
        final double n6 = 12;

        final String actual = positiveAndAverageToFormattedString(n1, n2, n3, n4, n5, n6);
        final String expected = """
                4 valores positivos
                7.4""";

        assertEquals(expected, actual);
    }
}