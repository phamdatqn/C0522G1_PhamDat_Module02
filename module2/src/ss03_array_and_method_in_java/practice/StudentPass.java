package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class StudentPass {// đếm số lượng sinh viên thi đỗ

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.print("Nhập số lượng sinh viên:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Số lượng không được quá 30 sinh viên");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }

        System.out.print("\nSố học sinh thi đỗ là: " + count);

    }
}
