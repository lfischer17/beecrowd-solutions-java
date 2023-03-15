package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1007_Difference {

    public static int calculateDifference(int a, int b, int c, int d) {

        return a * b - c * d;
    }

    public static String differenceToFormattedString(int a, int b, int c, int d) {

        return String.format("DIFERENCA = %d", calculateDifference(a, b, c, d));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        System.out.println(differenceToFormattedString(a, b, c, d));
    }
}
