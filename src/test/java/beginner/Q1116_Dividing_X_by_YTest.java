package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1116_Dividing_X_by_Y.dividingXByYToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1116_Dividing_X_by_YTest {

    @Test
    void test1() {

        final int numberOfCases = 3;
        final int x1 = 3;
        final int x2 = -8;
        final int x3 = 0;
        final int y1 = -2;
        final int y2 = 0;
        final int y3 = 8;
        final List<Integer> xs = List.of(x1, x2, x3);
        final List<Integer> ys = List.of(y1, y2, y3);

        final String actual = dividingXByYToFormattedString(xs, ys, numberOfCases);
        final String expected = """
                -1.5
                divisao impossivel
                0.0""";

        assertEquals(expected, actual);
    }
}