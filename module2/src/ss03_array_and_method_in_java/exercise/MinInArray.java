package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {//tìm min của mảng 1 chiều
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của mảng: ");
        int number = Integer.parseInt(sc.nextLine());

        int[] array;
        array = new int[number];

        createArray(sc,array);

        System.out.println("Mảng đã nhập");
        System.out.println(Arrays.toString(array));

        int min ;
        min = getMin(array);

        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }

    private static void createArray(Scanner sc, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
    }

    private static int getMin(int[] array) {
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
