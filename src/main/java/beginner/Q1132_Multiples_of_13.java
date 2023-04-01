package beginner;

import java.util.Scanner;

public class Q1132_Multiples_of_13 {

    private static int sumOfNumbersNotMultipleByThirteen(final int baseNumber, final int topNumber) {

        int sum = 0;
        for (int i = baseNumber; i <= topNumber; i++) {

            if (i % 13 != 0) {

                sum += i;
            }
        }

        return sum;
    }

    public static String numbersNotMultipleByThirteenSumToFormattedString(final int baseNumber, final int topNumber) {

        return String.format("%d", sumOfNumbersNotMultipleByThirteen(baseNumber, topNumber));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int baseNumber = scanner.nextInt();
        final int topNumber = scanner.nextInt();

        System.out.println(numbersNotMultipleByThirteenSumToFormattedString(baseNumber, topNumber));
    }
}
