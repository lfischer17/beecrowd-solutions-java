package beginner;

import java.util.Scanner;

public class Q1004_Simple_Product {
    
    public static int calculateProduct(int a, int b) {

        return a * b;
    }

    public static String productToFormattedString(int a, int b) {

        return String.format("PROD = %d", calculateProduct(a, b));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.println(productToFormattedString(a, b));
    }
}
