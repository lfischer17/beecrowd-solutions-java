package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1099_Sum_of_Consecutive_Odd_Numbers_II {

    private static int calculateSumOfConsecutiveOddNumbers(final int n1, final int n2) {

        int sum = 0;

        for (int i = n2 + 1; i < n1; i++) {

            if (i % 2 != 0) {

                sum += i;
            }
        }

        return sum;
    }

    private static String sumOfConsecutiveOddNumbersToFormattedString(final int n1, final int n2) {

        if (n1 < n2) {

            return String.format("%d", calculateSumOfConsecutiveOddNumbers(n2, n1));
        }

        return String.format("%d", calculateSumOfConsecutiveOddNumbers(n1, n2));
    }

    public static String sumOfConsecutiveOddNumbersToFormattedString(final List<Integer> n1List, final List<Integer> n2List, final int numberOfCases) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numberOfCases; i++) {

            stringBuilder.append(sumOfConsecutiveOddNumbersToFormattedString(n1List.get(i), n2List.get(i)));

            if (i < numberOfCases - 1) {

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int numberOfCases = scanner.nextInt();

        final List<Integer> n1List = new ArrayList<>();
        final List<Integer> n2List = new ArrayList<>();

        for (int i = 0; i < numberOfCases; i++) {

            n1List.add(scanner.nextInt());
            n2List.add(scanner.nextInt());
        }

        System.out.println(sumOfConsecutiveOddNumbersToFormattedString(n1List, n2List, numberOfCases));
    }
}
