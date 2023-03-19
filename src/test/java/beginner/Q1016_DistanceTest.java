package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1016_Distance.durationToFormattedString;
import static org.junit.jupiter.api.Assertions.*;

class Q1016_DistanceTest {

    @Test
    void test1() {

        final int distance = 30;

        final String actual = durationToFormattedString(distance);
        final String expected = "60 minutos";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int distance = 110;

        final String actual = durationToFormattedString(distance);
        final String expected = "220 minutos";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int distance = 7;

        final String actual = durationToFormattedString(distance);
        final String expected = "14 minutos";

        assertEquals(expected, actual);
    }
}