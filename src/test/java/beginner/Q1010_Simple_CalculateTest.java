package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1010_Simple_Calculate.calculateToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1010_Simple_CalculateTest {

    @Test
    void test1() {

        final int codeProduct1 = 12;
        final int amountProduct1 = 1;
        final double priceProduct1 = 5.30;
        final int codeProduct2 = 16;
        final int amountProduct2 = 2;
        final double priceProduct2 = 5.10;

        final String actual = calculateToFormattedString(codeProduct1, amountProduct1, priceProduct1, codeProduct2, amountProduct2, priceProduct2);
        final String expected = "VALOR A PAGAR: R$ 15.50";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int codeProduct1 = 13;
        final int amountProduct1 = 2;
        final double priceProduct1 = 15.30;
        final int codeProduct2 = 161;
        final int amountProduct2 = 4;
        final double priceProduct2 = 5.20;

        final String actual = calculateToFormattedString(codeProduct1, amountProduct1, priceProduct1, codeProduct2, amountProduct2, priceProduct2);
        final String expected = "VALOR A PAGAR: R$ 51.40";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int codeProduct1 = 1;
        final int amountProduct1 = 1;
        final double priceProduct1 = 15.10;
        final int codeProduct2 = 2;
        final int amountProduct2 = 1;
        final double priceProduct2 = 15.10;

        final String actual = calculateToFormattedString(codeProduct1, amountProduct1, priceProduct1, codeProduct2, amountProduct2, priceProduct2);
        final String expected = "VALOR A PAGAR: R$ 30.20";

        assertEquals(expected, actual);
    }
}