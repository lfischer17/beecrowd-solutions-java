package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1006_Average_2 {

    public static double calculateAverage(double a, double b, double c) {

        final double aWeight = 2;
        final double bWeight = 3;
        final double cWeight = 5;

        return (a * aWeight + b * bWeight + c * cWeight) / (aWeight + bWeight + cWeight);
    }

    public static String averageToFormattedString(double a, double b, double c) {

        return String.format("MEDIA = %.1f", calculateAverage(a, b, c));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        System.out.println(averageToFormattedString(a, b, c));
    }
}
