package ss02_loop.practice;

import java.util.Scanner;

public class MethodPrime {//kiểm tra số nguyên tố

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần lấy:");

        int count = 0;
        int nt = 2;
        int number = sc.nextInt();
        while (count < number) {
            if (methodPrimme(nt)) {
                System.out.print(nt + "\t");
                count++;
            }
            nt++;
        }
    }

    static boolean methodPrimme(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}