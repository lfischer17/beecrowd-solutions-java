package beginner;

import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q1008_Salary {

    private static double calculateSalary(int workHours, double salaryPerHour) {

        return workHours * salaryPerHour;
    }

    public static String salaryToFormattedString(int employeeNumber, int workHours, double salaryPerHour) {

        return String.format("""
                NUMBER = %d
                SALARY = U$ %.2f
                """, employeeNumber, calculateSalary(workHours, salaryPerHour));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int employeeNumber = scanner.nextInt();
        final int workHours = scanner.nextInt();
        final double salaryPerHour = scanner.nextDouble();

        System.out.println(salaryToFormattedString(employeeNumber, workHours, salaryPerHour));
    }
}
