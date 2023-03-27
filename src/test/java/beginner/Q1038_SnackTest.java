package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1038_Snack.priceToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1038_SnackTest {

    @Test
    void test1() {

        final int code = 3;
        final int quantity = 2;

        final String actual = priceToFormattedString(code, quantity);
        final String expected = "Total: R$ 10.00";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int code = 4;
        final int quantity = 3;

        final String actual = priceToFormattedString(code, quantity);
        final String expected = "Total: R$ 6.00";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int code = 2;
        final int quantity = 3;

        final String actual = priceToFormattedString(code, quantity);
        final String expected = "Total: R$ 13.50";

        assertEquals(expected, actual);
    }
}