package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1067_Odd_Numbers {

    private static List<Integer> generateOddNumbers(int limit) {

        final List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {

            if (i % 2 != 0) {

                oddNumbers.add(i);
            }
        }

        return oddNumbers;
    }

    public static String oddNumbersToFormattedString(int limit) {

        final List<Integer> oddNumbers = generateOddNumbers(limit);

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

        final int limit = scanner.nextInt();

        System.out.println(oddNumbersToFormattedString(limit));
    }
}
