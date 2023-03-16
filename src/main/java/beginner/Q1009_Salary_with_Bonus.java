package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1009_Salary_with_Bonus {

    private static double calculateSalary(double monthlySalary, double totalValueSold) {

        final double bonus =  (totalValueSold * 15) / 100;

        return monthlySalary + bonus;
    }

    public static String salaryToFormattedString(String employeeName, double monthlySalary, double totalValueSold) {

        return String.format("TOTAL = R$ %.2f", calculateSalary(monthlySalary, totalValueSold));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String employeeName = scanner.nextLine();
        final double monthlySalary = scanner.nextDouble();
        final double totalValueSold = scanner.nextDouble();

        System.out.println(salaryToFormattedString(employeeName, monthlySalary, totalValueSold));
    }
}
