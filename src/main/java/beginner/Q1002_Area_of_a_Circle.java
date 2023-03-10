package beginner;

import java.util.Scanner;

public class Q1002_Area_of_a_Circle {

    public static double calculateArea(double r) {

        final double pi = 3.14159;

        return pi * (r * r);
    }

    public static String areaToFormattedString(double r) {

        return String.format("A=%.4f", calculateArea(r));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double r = scanner.nextDouble();

        System.out.println(areaToFormattedString(r));
    }
}
