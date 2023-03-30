package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1113_Ascending_and_Descending {

    private static boolean isAscending(final int firstNumber, final int secondNumber) {

        return firstNumber < secondNumber;
    }

    public static String ascendingAndDescendingToFormattedString(final List<Integer> firstNumbers, final List<Integer> secondNumbers, final int numberOfCases) {

        final StringBuilder stringBuilder = new StringBuilder();

        int firstNumber, secondNumber;
        int nextFirstNumber, nextSecondNumber;
        for (int i = 0; i < numberOfCases; i++) {

            firstNumber = firstNumbers.get(i);
            secondNumber = secondNumbers.get(i);

            stringBuilder.append(isAscending(firstNumber, secondNumber) ? "Crescente" : "Decrescente");

            if (i < numberOfCases - 1) {

                nextFirstNumber = firstNumbers.get(i + 1);
                nextSecondNumber = secondNumbers.get(i + 1);

                if (nextFirstNumber == nextSecondNumber) {

                    return stringBuilder.toString();
                }

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> firstNumbers = new ArrayList<>();
        final List<Integer> secondNumbers = new ArrayList<>();

        int numberOfCases = 0;
        int firstNumber, secondNumber;
        while (true) {

            firstNumber = scanner.nextInt();
            secondNumber = scanner.nextInt();

            if (firstNumber == secondNumber) {

                break;
            }

            firstNumbers.add(firstNumber);
            secondNumbers.add(secondNumber);

            numberOfCases++;
        }

        System.out.println(ascendingAndDescendingToFormattedString(firstNumbers, secondNumbers, numberOfCases));
    }
}
