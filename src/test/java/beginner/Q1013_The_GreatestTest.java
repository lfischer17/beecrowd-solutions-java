package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1013_The_Greatest.theGreaterToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1013_The_GreatestTest {

    @Test
    void test1() {

        final int a = 7;
        final int b = 14;
        final int c = 106;

        final String actual = theGreaterToFormattedString(a, b, c);
        final String expected = "106 eh o maior";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int a = 217;
        final int b = 14;
        final int c = 6;

        final String actual = theGreaterToFormattedString(a, b, c);
        final String expected = "217 eh o maior";

        assertEquals(expected, actual);
    }
}