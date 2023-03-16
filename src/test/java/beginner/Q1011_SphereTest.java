package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1011_Sphere.calculateSphereVolumeToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1011_SphereTest {

    @Test
    void test1() {

        final double r = 3;

        final String actual = calculateSphereVolumeToFormattedString(r);
        final String expected = "VOLUME = 113.097";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final double r = 15;

        final String actual = calculateSphereVolumeToFormattedString(r);
        final String expected = "VOLUME = 14137.155";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final double r = 1523;

        final String actual = calculateSphereVolumeToFormattedString(r);
        final String expected = "VOLUME = 14797486501.627";

        assertEquals(expected, actual);
    }
}