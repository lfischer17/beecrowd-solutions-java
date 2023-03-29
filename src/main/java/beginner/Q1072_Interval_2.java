package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1072_Interval_2 {

    private static long countNumberWithinInterval(final List<Integer> numbers) {

        return numbers.stream().filter(number -> (number >= 10 && number <= 20)).count();
    }

    public static String numberWithinIntervalCountToFormattedString(final List<Integer> numbers) {

        final long numberWithinIntervalCount = countNumberWithinInterval(numbers);
        final long numberOutsideIntervalCount = numbers.size() - numberWithinIntervalCount;

        return String.format("""
                %d in
                %d out""", numberWithinIntervalCount, numberOutsideIntervalCount);
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int numberOfCases = scanner.nextInt();

        final List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numberOfCases; i++) {

            numbers.add(scanner.nextInt());
        }

        System.out.println(numberWithinIntervalCountToFormattedString(numbers));
    }
}
