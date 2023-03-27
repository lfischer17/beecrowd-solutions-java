package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1035_Selection_Test_1.selectionTestAnswer;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1035_Selection_Test_1Test {

    @Test
    void test1() {

        final int a = 5;
        final int b = 6;
        final int c = 7;
        final int d = 8;

        final String actual = selectionTestAnswer(a, b, c, d);
        final String expected = "Valores nao aceitos";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int a = 2;
        final int b = 3;
        final int c = 2;
        final int d = 6;

        final String actual = selectionTestAnswer(a, b, c, d);
        final String expected = "Valores aceitos";

        assertEquals(expected, actual);
    }
}