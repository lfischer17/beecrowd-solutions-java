package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1017_Fuel_Spent.fuelSpentToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1017_Fuel_SpentTest {

    @Test
    void test1() {

        final int time = 10;
        final int averageSpeed = 85;

        final String actual = fuelSpentToFormattedString(time, averageSpeed);
        final String expected = "70.833";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int time = 2;
        final int averageSpeed = 92;

        final String actual = fuelSpentToFormattedString(time, averageSpeed);
        final String expected = "15.333";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int time = 22;
        final int averageSpeed = 67;

        final String actual = fuelSpentToFormattedString(time, averageSpeed);
        final String expected = "122.833";

        assertEquals(expected, actual);
    }
}