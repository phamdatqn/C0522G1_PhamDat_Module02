package ss02_loop.exercise;

import java.util.Scanner;

public class FirstPrimesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố cần lấy: ");
        int number = sc.nextInt();

        countPrime(number);
    }

    private static void countPrime(int number) {
        int count = 0;
        int prime = 2;
        while (count < number) {
            if (isPrimeNumber(prime)) {
                count++;
                System.out.print(prime + "\t");
            }
            prime++;
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
