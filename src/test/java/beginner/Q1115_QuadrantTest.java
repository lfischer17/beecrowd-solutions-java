package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1115_Quadrant.coordinateToQuadrantString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1115_QuadrantTest {

    @Test
    void test1() {

        final int numberOfCases = 5;
        final int x1 = 2;
        final int x2 = 3;
        final int x3 = -8;
        final int x4 = -7;
        final int x5 = 0;
        final int y1 = 2;
        final int y2 = -2;
        final int y3 = -1;
        final int y4 = 1;
        final int y5 = 2;
        final List<Integer> xs = List.of(x1, x2, x3, x4, x5);
        final List<Integer> ys = List.of(y1, y2, y3, y4, y5);

        final String actual = coordinateToQuadrantString(xs, ys, numberOfCases);
        final String expected = """
                primeiro
                quarto
                terceiro
                segundo""";

        assertEquals(expected, actual);
    }
}