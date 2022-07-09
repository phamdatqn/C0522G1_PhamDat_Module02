package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class Currency {//đổi tiền tệ

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô tiền $ cần đổi: ");
        int usd = scanner.nextInt();
        System.out.println("Hiện nay tỷ giá : 1$ = 23000 VNĐ");
        int rate = 23000;
        int vnd = rate * usd;
        System.out.printf("Số tiền sau khi đổi là: %d VNĐ", vnd);
    }
}
