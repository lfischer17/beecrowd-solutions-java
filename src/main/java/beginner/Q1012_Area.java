package beginner;

import java.util.Scanner;

public class Q1012_Area {

    private static double calculateAreaOfRectangledTriangle(double a, double c) {

        return (a * c) / 2;
    }

    private static double calculateAreaOfCircle(double c) {

        final double pi = 3.14159;

        return pi * (c * c);
    }

    private static double calculateAreaOfTrapezium(double a, double b, double c) {

        return ((a + b) / 2) * c;
    }

    private static double calculateAreaOfSquare(double b) {

        return b * b;
    }

    private static double calculateAreaOfRectangle(double a, double b) {

        return a * b;
    }

    public static String areasToFormattedString(double a, double b, double c) {

        return String.format("""
                        TRIANGULO: %.3f
                        CIRCULO: %.3f
                        TRAPEZIO: %.3f
                        QUADRADO: %.3f
                        RETANGULO: %.3f
                        """,
                calculateAreaOfRectangledTriangle(a, c),
                calculateAreaOfCircle(c),
                calculateAreaOfTrapezium(a, b, c),
                calculateAreaOfSquare(b),
                calculateAreaOfRectangle(a, b));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        System.out.println(areasToFormattedString(a, b, c));
    }
}
