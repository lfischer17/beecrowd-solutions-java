package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1008_Salary.salaryToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1008_SalaryTest {

    @Test
    void test1() {

        final int employeeNumber = 25;
        final int workHours = 100;
        final double salaryPerHour = 5.50;

        final String actual = salaryToFormattedString(employeeNumber, workHours, salaryPerHour);
        final String expected = """
                NUMBER = 25
                SALARY = U$ 550.00
                """;

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int employeeNumber = 1;
        final int workHours = 200;
        final double salaryPerHour = 20.50;

        final String actual = salaryToFormattedString(employeeNumber, workHours, salaryPerHour);
        final String expected = """
                NUMBER = 1
                SALARY = U$ 4100.00
                """;

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int employeeNumber = 6;
        final int workHours = 145;
        final double salaryPerHour = 15.55;

        final String actual = salaryToFormattedString(employeeNumber, workHours, salaryPerHour);
        final String expected = """
                NUMBER = 6
                SALARY = U$ 2254.75
                """;

        assertEquals(expected, actual);
    }
}