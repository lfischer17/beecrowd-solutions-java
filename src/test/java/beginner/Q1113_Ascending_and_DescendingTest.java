package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1113_Ascending_and_Descending.ascendingAndDescendingToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1113_Ascending_and_DescendingTest {

    @Test
    void test1() {

        final int numberOfCases = 4;
        final int firstNumber1 = 5;
        final int firstNumber2 = 7;
        final int firstNumber3 = 3;
        final int firstNumber4 = 2;
        final int secondNumber1 = 4;
        final int secondNumber2 = 2;
        final int secondNumber3 = 8;
        final int secondNumber4 = 2;
        final List<Integer> firstNumbers = List.of(firstNumber1, firstNumber2, firstNumber3, firstNumber4);
        final List<Integer> secondNumbers = List.of(secondNumber1, secondNumber2, secondNumber3, secondNumber4);

        final String actual = ascendingAndDescendingToFormattedString(firstNumbers, secondNumbers, numberOfCases);
        final String expected = """
                Decrescente
                Decrescente
                Crescente""";

        assertEquals(expected, actual);
    }
}