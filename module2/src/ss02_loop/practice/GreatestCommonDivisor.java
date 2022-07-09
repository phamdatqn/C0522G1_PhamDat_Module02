package ss02_loop.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {//ước chung lớn nhất

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = sc.nextInt();

        System.out.println("Nhập số b: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất nào");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }

        }

        System.out.println("Ước chung lớn nhất: " + a);
    }
}
