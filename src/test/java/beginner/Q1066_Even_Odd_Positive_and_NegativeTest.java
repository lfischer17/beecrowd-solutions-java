package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1066_Even_Odd_Positive_and_Negative.evenOddPositiveNegativeToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1066_Even_Odd_Positive_and_NegativeTest {

    @Test
    void test1() {

        final int n1 = -5;
        final int n2 = 0;
        final int n3 = -3;
        final int n4 = -4;
        final int n5 = 12;

        final String actual = evenOddPositiveNegativeToFormattedString(n1, n2, n3, n4, n5);
        final String expected = """
                3 valor(es) par(es)
                2 valor(es) impar(es)
                1 valor(es) positivo(s)
                3 valor(es) negativo(s)""";

        assertEquals(expected, actual);
    }
}