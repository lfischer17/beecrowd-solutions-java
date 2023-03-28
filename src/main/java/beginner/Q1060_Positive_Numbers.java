package beginner;

import java.util.List;
import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1060_Positive_Numbers {

    private static long countPositiveNumber(final List<Double> numbers) {

        return numbers.stream().filter(number -> number > 0).count();
    }

    public static String positiveNumberCountToFormattedString(final double n1, final double n2, final double n3, final double n4, final double n5, final double n6) {

        final List<Double> numbers = List.of(n1, n2, n3, n4, n5, n6);

        return String.format("%d valores positivos", countPositiveNumber(numbers));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double n1 = scanner.nextDouble();
        final double n2 = scanner.nextDouble();
        final double n3 = scanner.nextDouble();
        final double n4 = scanner.nextDouble();
        final double n5 = scanner.nextDouble();
        final double n6 = scanner.nextDouble();

        System.out.println(positiveNumberCountToFormattedString(n1, n2, n3, n4, n5, n6));
    }
}
