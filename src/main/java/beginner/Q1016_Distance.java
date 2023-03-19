package beginner;

import java.util.Scanner;

public class Q1016_Distance {

    private static int calculateDuration(int distance) {

        return distance * 2;
    }

    public static String durationToFormattedString(int distance) {

        return String.format("%d minutos", calculateDuration(distance));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int distance = scanner.nextInt();

        System.out.println(durationToFormattedString(distance));
    }
}
