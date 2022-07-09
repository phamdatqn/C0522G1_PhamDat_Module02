package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra: ");
        int year = scanner.nextInt();
        boolean isLleapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLleapYear = true;
                }
            } else {
                isLleapYear = true;
            }
        }
        if (isLleapYear) {
            System.out.printf("%d là năm nhuận", year);
        } else {
            System.out.printf("%d không là năm nhuận", year);
        }
    }
}
