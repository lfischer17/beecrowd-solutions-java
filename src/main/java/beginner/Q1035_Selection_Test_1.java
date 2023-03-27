package beginner;

import java.util.Scanner;

public class Q1035_Selection_Test_1 {

    public static String selectionTestAnswer(final int a, final int b, final int c, final int d) {

        return (b > c) && (d > a) && (c + d > a + b) && ((c > 0) && (d > 0)) && (a % 2 == 0) ? "Valores aceitos" : "Valores nao aceitos";
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        System.out.println(selectionTestAnswer(a, b, c, d));
    }
}
