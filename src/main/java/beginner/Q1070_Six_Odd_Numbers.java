package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1070_Six_Odd_Numbers {

    private static List<Integer> generateSixOddNumbers(int baseNumber) {

        final List<Integer> oddNumbers = new ArrayList<>();

        int counter = 0;
        int number = baseNumber;
        while (counter < 6) {

            if (number % 2 != 0) {

                oddNumbers.add(number);

                counter++;
            }

            number++;
        }

        return oddNumbers;
    }

    public static String sixOddNumbersToFormattedString(int baseNumber) {

        final List<Integer> oddNumbers = generateSixOddNumbers(baseNumber);

        final StringBuilder oddNumbersStringBuilder = new StringBuilder();

        for (int i = 0; i < oddNumbers.size(); i++) {

            if (i == oddNumbers.size() - 1) {

                oddNumbersStringBuilder.append(oddNumbers.get(i));
            } else {

                oddNumbersStringBuilder.append(oddNumbers.get(i)).append("\n");
            }
        }

        return oddNumbersStringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int baseNumber = scanner.nextInt();

        System.out.println(sixOddNumbersToFormattedString(baseNumber));
    }
}
