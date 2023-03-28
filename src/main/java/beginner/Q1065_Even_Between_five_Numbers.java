package beginner;

import java.util.List;
import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1065_Even_Between_five_Numbers {

    private static long countEvenBetweenFiveNumbers(List<Integer> numbers) {

        return numbers.stream().filter(number -> number % 2 == 0).count();
    }

    public static String evenBetweenFiveNumbersCountToFormattedString(final int n1, final int n2, final int n3, final int n4, final int n5) {

        final List<Integer> numbers = List.of(n1, n2, n3, n4, n5);

        return String.format("%d valores pares", countEvenBetweenFiveNumbers(numbers));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();
        final int n3 = scanner.nextInt();
        final int n4 = scanner.nextInt();
        final int n5 = scanner.nextInt();

        System.out.println(evenBetweenFiveNumbersCountToFormattedString(n1, n2, n3, n4, n5));
    }
}
