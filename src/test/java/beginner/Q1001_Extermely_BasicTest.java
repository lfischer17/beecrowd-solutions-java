package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1001_Extermely_Basic.sumToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1001_Extermely_BasicTest {

    @Test
    void test1() {

        final int a = 10;
        final int b = 9;

        final String output = sumToFormattedString(a, b);

        assertEquals("X = 19", output);
    }

    @Test
    void test2() {

        final int a = -10;
        final int b = 4;

        final String output = sumToFormattedString(a, b);

        assertEquals("X = -6", output);
    }

    @Test
    void test3() {

        final int a = 15;
        final int b = -7;

        final String output = sumToFormattedString(a, b);

        assertEquals("X = 8", output);
    }
}