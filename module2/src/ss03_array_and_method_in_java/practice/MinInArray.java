package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập số lượng phần tử:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Số lượng phần tử không được quá 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.print("Mảng đã nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print("\t" + array[j]);
        }

        int index = minValue(array);
        System.out.println("\nPhần tử nhỏ nhất trong mảng là : " + array[index] + " ở vị trí " + index);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}

