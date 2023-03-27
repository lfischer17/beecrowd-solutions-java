package beginner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Q1038_Snack {

    private final static HashMap<Integer, Double> snackMenu = new LinkedHashMap<>();

    private static void initializeSnackMenu() {

        snackMenu.put(1, 4.00);
        snackMenu.put(2, 4.50);
        snackMenu.put(3, 5.00);
        snackMenu.put(4, 2.00);
        snackMenu.put(5, 1.50);
    }

    private static double calculatePrice(final int code, final int quantity) {

        initializeSnackMenu();

        return snackMenu.get(code) * quantity;
    }

    public static String priceToFormattedString(final int code, final int quantity) {

        return String.format("Total: R$ %.2f", calculatePrice(code, quantity));
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int code = scanner.nextInt();
        final int quantity = scanner.nextInt();

        System.out.println(priceToFormattedString(code, quantity));
    }
}
