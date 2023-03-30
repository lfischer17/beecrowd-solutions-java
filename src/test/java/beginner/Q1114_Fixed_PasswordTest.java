package beginner;

import org.junit.jupiter.api.Test;

import static beginner.Q1114_Fixed_Password.fixedPasswordToFormattedString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1114_Fixed_PasswordTest {

    @Test
    void test1() {

        final int password = 2200;

        final String actual = fixedPasswordToFormattedString(password);
        final String expected = "Senha Invalida";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int password = 1020;

        final String actual = fixedPasswordToFormattedString(password);
        final String expected = "Senha Invalida";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int password = 2022;

        final String actual = fixedPasswordToFormattedString(password);
        final String expected = "Senha Invalida";

        assertEquals(expected, actual);
    }

    @Test
    void test4() {

        final int password = 2002;

        final String actual = fixedPasswordToFormattedString(password);
        final String expected = "Acesso Permitido";

        assertEquals(expected, actual);
    }
}