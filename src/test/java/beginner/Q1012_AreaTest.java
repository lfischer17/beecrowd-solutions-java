package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1012_Area.areasToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1012_AreaTest {

    @Test
    void test1() {

        final double a = 3.0;
        final double b = 4.0;
        final double c = 5.2;

        final String actual = areasToFormattedString(a, b, c);
        final String expected = """
                TRIANGULO: 7.800
                CIRCULO: 84.949
                TRAPEZIO: 18.200
                QUADRADO: 16.000
                RETANGULO: 12.000
                """;

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final double a = 12.7;
        final double b = 10.4;
        final double c = 15.2;

        final String actual = areasToFormattedString(a, b, c);
        final String expected = """
                TRIANGULO: 96.520
                CIRCULO: 725.833
                TRAPEZIO: 175.560
                QUADRADO: 108.160
                RETANGULO: 132.080
                """;

        assertEquals(expected, actual);
    }
}