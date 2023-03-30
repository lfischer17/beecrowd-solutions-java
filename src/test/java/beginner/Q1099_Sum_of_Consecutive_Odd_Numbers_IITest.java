package beginner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static beginner.Q1099_Sum_of_Consecutive_Odd_Numbers_II.sumOfConsecutiveOddNumbersToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1099_Sum_of_Consecutive_Odd_Numbers_IITest {

    @Test
    void test1() {

        final int numberOfCases = 7;
        final int n11 = 4;
        final int n12 = 13;
        final int n13 = 6;
        final int n14 = 3;
        final int n15 = 3;
        final int n16 = 3;
        final int n17 = 3;
        final int n21 = 5;
        final int n22 = 10;
        final int n23 = 4;
        final int n24 = 3;
        final int n25 = 5;
        final int n26 = 4;
        final int n27 = 8;
        final List<Integer> n1List = List.of(n11, n12, n13, n14, n15, n16, n17);
        final List<Integer> n2List = List.of(n21, n22, n23, n24, n25, n26, n27);

        final String actual = sumOfConsecutiveOddNumbersToFormattedString(n1List, n2List, numberOfCases);
        final String expected = """
                0
                11
                5
                0
                0
                0
                12""";

        assertEquals(expected, actual);
    }
}