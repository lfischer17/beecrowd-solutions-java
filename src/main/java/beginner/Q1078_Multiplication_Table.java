package beginner;

import java.util.Scanner;

public class Q1078_Multiplication_Table {

    public static String multiplicationTableToFormattedString(final int number) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            stringBuilder.append(String.format("%d x %d = %d", i, number, i * number));

            if (i < 10) {

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int number = scanner.nextInt();

        System.out.println(multiplicationTableToFormattedString(number));
    }
}
