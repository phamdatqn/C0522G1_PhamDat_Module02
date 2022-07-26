package utils;

import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static String getString(String target) {
        System.out.println(target);
        return scanner.nextLine();
    }

    public static double getDouble(String str) {
        double tryD;
        System.out.println(str);
        while (true) {
            try {
                tryD = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai, Không được nhập chữ!!!");
                System.out.println(e.getMessage());
            }
        }
        return tryD;
    }

    public static int getInt(String str) {
        int tryInt;
        System.out.println(str);
        while (true) {
            try {
                tryInt = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai, Không được nhập chữ");
            }
        }
        return tryInt;
    }
}
