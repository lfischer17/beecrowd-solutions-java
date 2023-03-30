package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1101_Sequence_of_Numbers_and_Sum {

    private static List<Integer> generateSequenceOfNumbers(final int topNumber, final int baseNumber) {

        final List<Integer> numbersSequence = new ArrayList<>();

        for (int i = baseNumber; i <= topNumber; i++) {

            numbersSequence.add(i);
        }

        return numbersSequence;
    }

    private static int sumSequenceOfNumbers(final List<Integer> numbersSequence) {

        return numbersSequence.stream().mapToInt(Integer::intValue).sum();
    }

    private static String numbersSequenceToFormattedString(final List<Integer> numbersSequence) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbersSequence.size(); i++) {

            stringBuilder.append(numbersSequence.get(i));

            if (i < numbersSequence.size() - 1) {

                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }

    public static String sequenceOfNumbersAndSumToFormattedString(final List<Integer> topNumbers, final List<Integer> baseNumbers, final int numberOfCases) {

        final StringBuilder stringBuilder = new StringBuilder();

        int topNumber, baseNumber;
        int nextTopNumber, nextBaseNumber;
        List<Integer> numbersSequence;
        String numbersSequenceString;
        int numbersSequenceSum;
        for (int i = 0; i < numberOfCases; i++) {

            topNumber = topNumbers.get(i);
            baseNumber = baseNumbers.get(i);

            numbersSequence = generateSequenceOfNumbers(topNumber, baseNumber);

            numbersSequenceString = numbersSequenceToFormattedString(numbersSequence);
            numbersSequenceSum = sumSequenceOfNumbers(numbersSequence);

            stringBuilder.append(String.format("%s Sum=%d", numbersSequenceString, numbersSequenceSum));

            if (i < numberOfCases - 1) {

                nextTopNumber = topNumbers.get(i + 1);
                nextBaseNumber = baseNumbers.get(i + 1);

                if (nextTopNumber == 0 || nextBaseNumber == 0) {

                    return stringBuilder.toString();
                }

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> topNumbers = new ArrayList<>();
        final List<Integer> baseNumbers = new ArrayList<>();

        int numberOfCases = 0;
        int topNumber, baseNumber;
        while (true) {

            topNumber = scanner.nextInt();
            baseNumber = scanner.nextInt();

            if (topNumber == 0 || baseNumber == 0) {

                break;
            }

            topNumbers.add(topNumber);
            baseNumbers.add(baseNumber);

            numberOfCases++;
        }

        System.out.println(sequenceOfNumbersAndSumToFormattedString(topNumbers, baseNumbers, numberOfCases));
    }
}
