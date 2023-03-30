package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1074_Even_or_Odd.evenOrOddToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1074_Even_or_OddTest {

    @Test
    void test1() {

        final int numberOfCases = 4;
        final int n1 = -5;
        final int n2 = 0;
        final int n3 = 3;
        final int n4 = -4;
        final List<Integer> numbers = List.of(n1, n2, n3, n4);

        final String actual = evenOrOddToFormattedString(numbers);
        final String expected = """
                ODD NEGATIVE
                NULL
                ODD POSITIVE
                EVEN NEGATIVE""";

        assertEquals(expected, actual);
    }
}