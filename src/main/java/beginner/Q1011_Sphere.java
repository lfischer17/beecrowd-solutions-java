package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1011_Sphere {

    private static double calculateSphereVolume(double r) {

        final double pi = 3.14159;

        return (4.0 / 3.0) * pi * (r * r * r);
    }

    public static String calculateSphereVolumeToFormattedString(double r) {

        return String.format("VOLUME = %.3f", calculateSphereVolume(r));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double r = scanner.nextDouble();

        System.out.println(calculateSphereVolumeToFormattedString(r));
    }
}
