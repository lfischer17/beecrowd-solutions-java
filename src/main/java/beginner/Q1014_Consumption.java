package beginner;

import java.util.Scanner;

public class Q1014_Consumption {

    private static double calculateFuelSpent(int x, double y) {

        return x / y;
    }

    public static String fuelSpentToFormattedString(int x, double y) {

        return String.format("%.3f km/l", calculateFuelSpent(x, y));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int x = scanner.nextInt();
        final double y = scanner.nextDouble();

        System.out.println(fuelSpentToFormattedString(x, y));
    }
}
