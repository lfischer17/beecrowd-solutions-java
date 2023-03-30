package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1115_Quadrant {

    public static String coordinateToQuadrantString(final int x, final int y) {

        if (x > 0 && y > 0) {

            return "primeiro";
        }

        if (x < 0 && y > 0) {

            return "segundo";
        }

        if (x < 0 && y < 0) {

            return "terceiro";
        }

        if (x > 0 && y < 0) {

            return "quarto";
        }

        return "Origem";
    }

    public static String coordinateToQuadrantString(final List<Integer> xs, final List<Integer> ys, final int numberOfCases) {

        final StringBuilder stringBuilder = new StringBuilder();

        int x, y;
        int nextX, nextY;
        for (int i = 0; i < numberOfCases; i++) {

            x = xs.get(i);
            y = ys.get(i);

            stringBuilder.append(coordinateToQuadrantString(x, y));

            if (i < numberOfCases - 1) {

                nextX = xs.get(i + 1);
                nextY = ys.get(i + 1);

                if (nextX == 0 | nextY == 0) {

                    return stringBuilder.toString();
                }

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> xs = new ArrayList<>();
        final List<Integer> ys = new ArrayList<>();

        int numberOfCases = 0;
        int x, y;
        while (true) {

            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x == 0 | y == 0) {

                break;
            }

            xs.add(x);
            ys.add(y);

            numberOfCases++;
        }

        System.out.println(coordinateToQuadrantString(xs, ys, numberOfCases));
    }
}
