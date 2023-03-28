package beginner;

import java.util.List;
import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1066_Even_Odd_Positive_and_Negative {

    private static long countEven(List<Integer> numbers) {

        return numbers.stream().filter(number -> number % 2 == 0).count();
    }

    private static long countOdd(List<Integer> numbers) {

        return numbers.stream().filter(number -> number % 2 != 0).count();
    }

    private static long countPositive(List<Integer> numbers) {

        return numbers.stream().filter(number -> number > 0).count();
    }

    private static long countNegative(List<Integer> numbers) {

        return numbers.stream().filter(number -> number < 0).count();
    }

    public static String evenOddPositiveNegativeToFormattedString(final int n1, final int n2, final int n3, final int n4, final int n5) {

        final List<Integer> numbers = List.of(n1, n2, n3, n4, n5);

        return String.format("""
                        %d valor(es) par(es)
                        %d valor(es) impar(es)
                        %d valor(es) positivo(s)
                        %d valor(es) negativo(s)""",
                countEven(numbers),
                countOdd(numbers),
                countPositive(numbers),
                countNegative(numbers));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();
        final int n3 = scanner.nextInt();
        final int n4 = scanner.nextInt();
        final int n5 = scanner.nextInt();

        System.out.println(evenOddPositiveNegativeToFormattedString(n1, n2, n3, n4, n5));
    }
}
