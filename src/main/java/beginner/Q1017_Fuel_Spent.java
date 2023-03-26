package beginner;

import java.util.Scanner;

public class Q1017_Fuel_Spent {

    private static int calculateDistance(final int time, final int averageSpeed) {

        return time * averageSpeed;
    }

    private static double calculateFuelSpent(final int time, final int averageSpeed) {

        final int kilometerPerLiter = 12;

        return (double) calculateDistance(time, averageSpeed) / (double) kilometerPerLiter;
    }

    public static String fuelSpentToFormattedString(final int time, final int averageSpeed) {

        return String.format("%.3f", calculateFuelSpent(time, averageSpeed));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int time = scanner.nextInt();
        final int averageSpeed = scanner.nextInt();

        System.out.println(fuelSpentToFormattedString(time, averageSpeed));
    }
}
