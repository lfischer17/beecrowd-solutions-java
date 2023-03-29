package beginner;

import java.util.Scanner;

public class Q1073_Even_Square {

    public static String evenSquareToFormattedString(final int topNumber) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 2; i <= topNumber; i += 2) {

            if (i == topNumber) {

                stringBuilder.append(String.format("%d^%d = %d", i, 2, i * i));

                continue;
            }

            stringBuilder.append(String.format("%d^%d = %d\n", i, 2, i * i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int topNumber = scanner.nextInt();

        if (topNumber < 5 || topNumber >= 2000) {

            throw new IllegalArgumentException();
        }

        System.out.println(evenSquareToFormattedString(topNumber));
    }
}
