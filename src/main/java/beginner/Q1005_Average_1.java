package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1005_Average_1 {

    public static double calculateAverage(double a, double b) {

        final double aWeight = 3.5;
        final double bWeight = 7.5;

        return (a * aWeight + b * bWeight) / (aWeight + bWeight);
    }

    public static String averageToFormattedString(double a, double b) {

        return String.format("MEDIA = %.5f", calculateAverage(a, b));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();

        System.out.println(averageToFormattedString(a, b));
    }
}
