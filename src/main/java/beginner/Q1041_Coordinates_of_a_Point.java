package beginner;

import java.util.Scanner;

public class Q1041_Coordinates_of_a_Point {

    public static String coordinateToQuadrantString(final double x, final double y) {

        if (x == 0 && y != 0) {

            return "Eixo X";
        }

        if (x != 0 && y == 0) {

            return "Eixo Y";
        }

        if (x > 0 && y > 0) {

            return "Q1";
        }

        if (x < 0 && y > 0) {

            return "Q2";
        }

        if (x < 0 && y < 0) {

            return "Q3";
        }

        if (x > 0 && y < 0) {

            return "Q4";
        }

        return "Origem";
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final double x = scanner.nextDouble();
        final double y = scanner.nextDouble();

        System.out.println(coordinateToQuadrantString(x, y));
    }
}
