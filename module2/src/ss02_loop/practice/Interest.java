package ss02_loop.practice;

import java.util.Scanner;

public class Interest {//lãi xuất ngân hàng

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tiền vay: ");
        double money = sc.nextDouble();

        System.out.println("Nhập số tháng vay: ");
        int month = sc.nextInt();

        System.out.println("Nhập lãi xuất: ");

        double interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * month * (interestRate / 100) / 12;
        }

        System.out.printf("tổng lãi xuất là: %.2f", totalInterest);
    }
}
