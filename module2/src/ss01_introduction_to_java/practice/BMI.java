package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class BMI {//chỉ số cân nặng của cơ thể

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng của bạn:");
        weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao của bạn: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Tình trạng\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
