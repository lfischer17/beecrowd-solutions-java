package beginner;

import java.util.Scanner;

public class Q1044_Multiples {

    private static boolean isMultiples(final int a, final int b) {

        if (a > b) {
            return a % b == 0;
        }

        return b % a == 0;
    }

    public static String isMultipleToFormattedString(final int a, final int b) {

        return isMultiples(a, b) ? "Sao Multiplos" : "Nao sao Multiplos";
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.println(isMultipleToFormattedString(a, b));
    }
}
