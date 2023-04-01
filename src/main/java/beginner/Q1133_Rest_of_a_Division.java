package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1133_Rest_of_a_Division {

    private static List<Integer> calculateRestOfADivisionNumbers(final int baseNumber, final int topNumber) {

        final List<Integer> numbers = new ArrayList<>();
        for (int i = baseNumber + 1; i <= topNumber - 1; i++) {

            if (i % 5 == 2 || i % 5 == 3) {

                numbers.add(i);
            }
        }

        return numbers;
    }

    public static String restOfADivisionNumbersToFormattedString(final int baseNumber, final int topNumber) {

        final StringBuilder stringBuilder = new StringBuilder();

        final List<Integer> numbers = calculateRestOfADivisionNumbers(baseNumber, topNumber);

        for (int i = 0; i < numbers.size(); i++) {

            stringBuilder.append(String.format("%d", numbers.get(i)));

            if (i < numbers.size() - 1) {

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int baseNumber = scanner.nextInt();
        final int topNumber = scanner.nextInt();

        System.out.println(restOfADivisionNumbersToFormattedString(baseNumber, topNumber));
    }
}
