package ss02_loop.exercise;

import java.util.Scanner;

public class PrimeLessInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("lấy số nguyên tố nhỏ hơn số bạn nhập là: ?");
        int n = sc.nextInt();

        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);

        if (n > 2) {
            System.out.print(2);
            for (int i = 3; i < n; i += 2) {
                if (isPrimeNumber(i)) {
                    System.out.print(" " + i);
                }
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
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



