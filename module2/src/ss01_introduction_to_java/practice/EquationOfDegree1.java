package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class EquationOfDegree1 {//phương trình bậc 1

    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 1");
        System.out.println("Cho một chương trình 'a * x + b = c', vui lòng nhập giá trị a,b,c:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double numberA = scanner.nextDouble();

        System.out.println("Nhập b: ");
        double numberB = scanner.nextDouble();

        System.out.println("Nhập c: ");
        double numberC = scanner.nextDouble();
        if (numberA != 0) {
            double result = (numberC - numberB) / numberA;
            System.out.printf("Chương trình có 1 nghiệm duy nhất là x = %.2f!\n", result);
        } else {
            if (numberB == numberC) {
                System.out.print("Chương trình có vô số nghiệm x!");
            } else {
                System.out.print("Chương trình vô nghiệm");
            }
        }
    }
}
