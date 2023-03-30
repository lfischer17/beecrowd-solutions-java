package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1101_Sequence_of_Numbers_and_Sum.sequenceOfNumbersAndSumToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1101_Sequence_of_Numbers_and_SumTest {

    @Test
    void test1() {

        final int numberOfCases = 3;
        final int topNumber1 = 5;
        final int topNumber2 = 6;
        final int topNumber3 = 5;
        final int baseNumber1 = 2;
        final int baseNumber2 = 3;
        final int baseNumber3 = 0;
        final List<Integer> topNumbers = List.of(topNumber1, topNumber2, topNumber3);
        final List<Integer> baseNumbers = List.of(baseNumber1, baseNumber2, baseNumber3);

        final String actual = sequenceOfNumbersAndSumToFormattedString(topNumbers, baseNumbers, numberOfCases);
        final String expected = """
                2 3 4 5 Sum=14
                3 4 5 6 Sum=18""";

        assertEquals(expected, actual);
    }
}