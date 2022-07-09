package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class DayInMonth {//ngày trong tháng

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn tính ngày: ");
        int month = scanner.nextInt();//1, 3, 5, 7, 8, 10, 12 31 ngày
        switch (month) {
            case 2:
                System.out.println("Tháng '2' có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            default:
                System.out.println("Tháng " + month + " có 30 ngày");
        }
    }
}
