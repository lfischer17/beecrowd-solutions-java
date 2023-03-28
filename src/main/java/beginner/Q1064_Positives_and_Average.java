package beginner;

import java.util.List;
import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1064_Positives_and_Average {

    private static long countPositiveNumber(final List<Double> numbers) {

        return numbers.stream().filter(number -> number > 0).count();
    }

    private static double sumPositiveNumber(final List<Double> numbers) {

        return numbers.stream().filter(number -> number > 0).mapToDouble(Double::doubleValue).sum();
    }

    private static double calculateAverageOfPositiveNumber(final List<Double> numbers) {

        final double sumOfPositiveNumber = sumPositiveNumber(numbers);
        final double countOfPositiveNumber = countPositiveNumber(numbers);

        return sumOfPositiveNumber / countOfPositiveNumber;
    }

    public static String positiveAndAverageToFormattedString(final double n1, final double n2, final double n3, final double n4, final double n5, final double n6) {

        final List<Double> numbers = List.of(n1, n2, n3, n4, n5, n6);

        return String.format("""
                %d valores positivos
                %.1f""", countPositiveNumber(numbers), calculateAverageOfPositiveNumber(numbers));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double n1 = scanner.nextDouble();
        final double n2 = scanner.nextDouble();
        final double n3 = scanner.nextDouble();
        final double n4 = scanner.nextDouble();
        final double n5 = scanner.nextDouble();
        final double n6 = scanner.nextDouble();

        System.out.println(positiveAndAverageToFormattedString(n1, n2, n3, n4, n5, n6));
    }
}
