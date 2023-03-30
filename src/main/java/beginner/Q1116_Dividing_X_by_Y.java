package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1116_Dividing_X_by_Y {

    private static String dividingXByYToFormattedString(final int x, final int y) {

        if (y == 0) {

            return "divisao impossivel";
        }

        return String.format("%.1f", (double) x / y);
    }

    public static String dividingXByYToFormattedString(final List<Integer> xs, final List<Integer> ys, final int numberOfCases) {

        final StringBuilder stringBuilder = new StringBuilder();

        int x, y;
        for (int i = 0; i < numberOfCases; i++) {

            x = xs.get(i);
            y = ys.get(i);

            stringBuilder.append(dividingXByYToFormattedString(x, y));

            if (i < numberOfCases - 1) {

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> xs = new ArrayList<>();
        final List<Integer> ys = new ArrayList<>();

        final int numberOfCases = scanner.nextInt();

        int counter = 0;
        while (counter < numberOfCases) {

            xs.add(scanner.nextInt());
            ys.add(scanner.nextInt());

            counter++;
        }

        System.out.println(dividingXByYToFormattedString(xs, ys, numberOfCases));
    }
}
