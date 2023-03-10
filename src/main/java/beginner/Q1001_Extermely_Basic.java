package beginner;

import java.util.Scanner;

public class Q1001_Extermely_Basic {

    public static int sum(int a, int b) {

        return a + b;
    }

    public static String sumToFormattedString(int a, int b) {

        return String.format("X = %d", sum(a, b));
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.println(sumToFormattedString(a, b));
    }
}
