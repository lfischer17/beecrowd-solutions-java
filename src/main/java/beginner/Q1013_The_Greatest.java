package beginner;

import java.util.Scanner;

public class Q1013_The_Greatest {

    private static int calculateTheGreater(int a, int b) {

        return (a + b + Math.abs(a - b)) / 2;
    }

    private static int calculateTheGreater(int a, int b, int c) {

        return calculateTheGreater(a, calculateTheGreater(b, c));
    }

    public static String theGreaterToFormattedString(int a, int b, int c) {

        return String.format("%d eh o maior", calculateTheGreater(a, b, c));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(theGreaterToFormattedString(a, b, c));
    }
}
