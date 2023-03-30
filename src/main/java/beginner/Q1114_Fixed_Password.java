package beginner;

import java.util.Scanner;

public class Q1114_Fixed_Password {

    public static String fixedPasswordToFormattedString(final int password) {

        return String.format((password == 2002) ? "Acesso Permitido" : "Senha Invalida");
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int password = scanner.nextInt();

        System.out.println(fixedPasswordToFormattedString(password));
    }
}
