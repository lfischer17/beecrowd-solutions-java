package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1002_Area_of_a_Circle.areaToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1002_Area_of_a_CircleTest {

    @Test
    void test1() {

        final double r = 2.00;

        final String output = areaToFormattedString(r);

        assertEquals("A=12.5664", output);
    }

    @Test
    void test2() {

        final double r = 100.64;

        final String output = areaToFormattedString(r);

        assertEquals("A=31819.3103", output);
    }

    @Test
    void test3() {

        final double r = 150.00;

        final String output = areaToFormattedString(r);

        assertEquals("A=70685.7750", output);
    }
}