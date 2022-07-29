package utils;

import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static String getString(String target) {
        System.out.print(target);
        return scanner.nextLine();
    }

    public static double getDouble(String str) {
        double tryD;
        while (true) {
            try {
                System.out.print(str);
                tryD = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai, Không được nhập chữ!!!");
                System.out.println(e.getMessage());
            }
        }
        return tryD;
    }

    public static int getInt(String target) {
        int tryInt;
        while (true) {
            System.out.print(target);
            try {

                tryInt = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai, Không được nhập chữ");
                e.printStackTrace();
                System.out.println(" ");

            }
        }
        return tryInt;
    }

}
