package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1004_Simple_Product.productToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1004_Simple_ProductTest {

    @Test
    void test1() {

        final int a = 3;
        final int b = 9;

        final String output = productToFormattedString(a, b);

        assertEquals("PROD = 27", output);
    }

    @Test
    void test2() {

        final int a = -30;
        final int b = 10;

        final String output = productToFormattedString(a, b);

        assertEquals("PROD = -300", output);
    }

    @Test
    void test3() {

        final int a = 0;
        final int b = 9;

        final String output = productToFormattedString(a, b);

        assertEquals("PROD = 0", output);
    }
}