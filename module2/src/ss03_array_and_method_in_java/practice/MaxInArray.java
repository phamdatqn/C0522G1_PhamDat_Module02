package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class MaxInArray {// tìm giá trị lớn nhất trong mảng

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

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("\nSố lớn nhất trong mảng là " + max + " ,ở vị trí: " + index);
    }
}
