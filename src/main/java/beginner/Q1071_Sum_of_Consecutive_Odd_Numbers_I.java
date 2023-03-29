package beginner;

import java.util.Scanner;

public class Q1071_Sum_of_Consecutive_Odd_Numbers_I {

    private static int calculateSumOfConsecutiveOddNumbers(final int topNumber, final int baseNumber) {

        int sum = 0;

        for (int i = baseNumber + 1; i < topNumber; i++) {

            if (i % 2 != 0) {

                sum += i;
            }
        }

        return sum;
    }

    public static String sumOfConsecutiveOddNumbersToFormattedString(final int topNumber, final int baseNumber) {

        return String.format("%d", calculateSumOfConsecutiveOddNumbers(topNumber, baseNumber));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int topNumber = scanner.nextInt();
        final int baseNumber = scanner.nextInt();

        System.out.println(sumOfConsecutiveOddNumbersToFormattedString(topNumber, baseNumber));
    }
}
