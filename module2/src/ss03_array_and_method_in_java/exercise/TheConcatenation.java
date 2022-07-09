package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheConcatenation {//gộp mảng.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1:");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        createArray(sc, size1, array1);


        System.out.println("Nhập số lượng phần tử mảng 2:");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        createArray(sc, size2, array2);

        //gộp mảng
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Mảng 1:");
        System.out.println(Arrays.toString(array1));

        System.out.println("Mảng 2:");
        System.out.println(Arrays.toString(array2));

        System.out.println("Mảng sau khi gộp:");
        System.out.println(Arrays.toString(array3));

    }

    private static void createArray(Scanner sc, int size2, int[] array2) {
        for (int i = 0; i < size2; i++) {
            System.out.println("Nhập phần tử thứ : " + (i + 1) + " của mảng");
            array2[i] = sc.nextInt();
        }
    }
}
