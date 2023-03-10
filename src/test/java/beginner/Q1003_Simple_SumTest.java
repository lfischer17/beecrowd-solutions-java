package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1003_Simple_Sum.sumToFormattedString;
import static org.junit.jupiter.api.Assertions.*;

class Q1003_Simple_SumTest {

    @Test
    void test1() {

        final int a = 30;
        final int b = 10;

        final String output = sumToFormattedString(a, b);

        assertEquals("SOMA = 40", output);
    }

    @Test
    void test2() {

        final int a = -30;
        final int b = 10;

        final String output = sumToFormattedString(a, b);

        assertEquals("SOMA = -20", output);
    }

    @Test
    void test3() {

        final int a = 0;
        final int b = 0;

        final String output = sumToFormattedString(a, b);

        assertEquals("SOMA = 0", output);
    }
}