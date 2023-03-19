package beginner;

import java.util.Scanner;

public class Q1015_Distance_Between_Two_Points {

    private static double calculateDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static String distanceToFormattedString(double x1, double y1, double x2, double y2) {

        return String.format("%.4f", calculateDistance(x1, y1, x2, y2));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double x1 = scanner.nextDouble();
        final double y1 = scanner.nextDouble();
        final double x2 = scanner.nextDouble();
        final double y2 = scanner.nextDouble();

        System.out.printf(distanceToFormattedString(x1, y1, x2, y2));
    }
}
