package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1074_Even_or_Odd {

    private static String calculateEvenOrOdd(final int number) {

        final StringBuilder stringBuilder = new StringBuilder();

        if (number != 0) {

            if (number % 2 == 0) {

                stringBuilder.append("EVEN").append(" ");
            } else {

                stringBuilder.append("ODD").append(" ");
            }

            if (number > 0) {

                stringBuilder.append("POSITIVE");
            } else {

                stringBuilder.append("NEGATIVE");
            }

            return stringBuilder.toString();
        }

        return "NULL";
    }

    public static String evenOrOddToFormattedString(final List<Integer> numbers) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {

            if (i == numbers.size() - 1) {

                stringBuilder.append(String.format("%s", calculateEvenOrOdd(numbers.get(i))));

                continue;
            }

            stringBuilder.append(String.format("%s", calculateEvenOrOdd(numbers.get(i)))).append("\n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int numberOfCases = scanner.nextInt();

        final List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numberOfCases; i++) {

            numbers.add(scanner.nextInt());
        }

        System.out.println(evenOrOddToFormattedString(numbers));
    }
}
