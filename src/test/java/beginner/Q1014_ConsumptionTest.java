package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1014_Consumption.fuelSpentToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1014_ConsumptionTest {

    @Test
    void test1() {

        final int x = 500;
        final double y = 35.0;

        final String actual = fuelSpentToFormattedString(x, y);
        final String expected = "14.286 km/l";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int x = 2254;
        final double y = 124.4;

        final String actual = fuelSpentToFormattedString(x, y);
        final String expected = "18.119 km/l";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int x = 4554;
        final double y = 464.6;

        final String actual = fuelSpentToFormattedString(x, y);
        final String expected = "9.802 km/l";

        assertEquals(expected, actual);
    }
}