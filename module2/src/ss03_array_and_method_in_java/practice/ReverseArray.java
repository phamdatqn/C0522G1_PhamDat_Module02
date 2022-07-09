package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập số lượng phần tử:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Phần tử không được lớn hơn 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Mảng đã nhập là : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print("\t" + array[j]);
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.print("\nMảng sau khi đảo ngược: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print("\t" + array[j]);
        }
    }
}


