package beginner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static beginner.Q1009_Salary_with_Bonus.salaryToFormattedString;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q1009_Salary_with_BonusTest {

    @Test
    @Disabled
    void test1() {

        final String employeeName = "JOAO";
        final double monthlySalary = 500.00;
        final double totalValueSold = 1230.30;

        final String actual = salaryToFormattedString(employeeName, monthlySalary, totalValueSold);
        final String expected = "TOTAL = R$ 684.54";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final String employeeName = "PEDRO";
        final double monthlySalary = 700.00;
        final double totalValueSold = 0.00;

        final String actual = salaryToFormattedString(employeeName, monthlySalary, totalValueSold);
        final String expected = "TOTAL = R$ 700.00";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final String employeeName = "MANGOJATA";
        final double monthlySalary = 1700.00;
        final double totalValueSold = 1230.50;

        final String actual = salaryToFormattedString(employeeName, monthlySalary, totalValueSold);
        final String expected = "TOTAL = R$ 1884.58";

        assertEquals(expected, actual);
    }
}