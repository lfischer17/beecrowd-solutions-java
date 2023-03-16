package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1010_Simple_Calculate {

    private static double calculate(int code, int amount, double price) {

        return amount * price;
    }

    public static String calculateToFormattedString(int codeProduct1, int amountProduct1, double priceProduct1, int codeProduct2, int amountProduct2, double priceProduct2) {

        return String.format("VALOR A PAGAR: R$ %.2f", calculate(codeProduct1, amountProduct1, priceProduct1) + calculate(codeProduct2, amountProduct2, priceProduct2));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int codeProduct1 = scanner.nextInt();
        final int amountProduct1 = scanner.nextInt();
        final double priceProduct1 = scanner.nextDouble();
        final int codeProduct2 = scanner.nextInt();
        final int amountProduct2 = scanner.nextInt();
        final double priceProduct2 = scanner.nextDouble();

        System.out.println(calculateToFormattedString(codeProduct1, amountProduct1, priceProduct1, codeProduct2, amountProduct2, priceProduct2));
    }
}
