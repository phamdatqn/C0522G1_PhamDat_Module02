package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheAdditionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của mảng: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập array[%d]: ", i);
            array[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa tạo: ");
        System.out.println(Arrays.toString(array));

        int[] newArray = new int[size + 1];

        System.out.println("Nhập phần tử cần chèn vào mảng: ");
        int number = sc.nextInt();

        System.out.println("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();

        if (index < -1 || index > array.length) {
            System.out.println("không chèn được phần tử vào mảng.");
        }

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = number;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        array = newArray;
        System.out.println("mảng sau khi chèn");
        System.out.println(Arrays.toString(array));
    }
}

