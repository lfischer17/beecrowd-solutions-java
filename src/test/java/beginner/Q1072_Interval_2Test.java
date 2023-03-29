package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1072_Interval_2.numberWithinIntervalCountToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1072_Interval_2Test {

    @Test
    void test1() {

        final int numberOfCases = 4;
        final int n1 = 14;
        final int n2 = 123;
        final int n3 = 10;
        final int n4 = -25;
        final List<Integer> numbers = List.of(n1, n2, n3, n4);

        final String actual = numberWithinIntervalCountToFormattedString(numbers);
        final String expected = """
                2 in
                2 out""";

        assertEquals(expected, actual);
    }
}