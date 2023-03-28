package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1059_Even_Numbers {

    private static List<Integer> generateEvenNumbers(int limit) {

        final List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {

            if (i % 2 == 0) {

                evenNumbers.add(i);
            }
        }

        return evenNumbers;
    }

    public static String evenNumbersToFormattedString(int limit) {

        final List<Integer> evenNumbers = generateEvenNumbers(limit);

        final StringBuilder evenNumbersStringBuilder = new StringBuilder();

        for (int i = 0; i < evenNumbers.size(); i++) {

            if (i == evenNumbers.size() - 1) {

                evenNumbersStringBuilder.append(evenNumbers.get(i));
            } else {

                evenNumbersStringBuilder.append(evenNumbers.get(i)).append("\n");
            }
        }

        return evenNumbersStringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int limit = scanner.nextInt();

        System.out.println(evenNumbersToFormattedString(limit));
    }
}
