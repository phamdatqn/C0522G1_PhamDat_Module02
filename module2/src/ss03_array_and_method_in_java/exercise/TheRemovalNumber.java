package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheRemovalNumber {//xóa phần tử trong mảng

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array;
        array = createArray(sc);

        System.out.print("Mảng đã nhập: " + Arrays.toString(array));

        System.out.println("\nNhập số cần xóa: ");
        int number = sc.nextInt();

        boolean notInArray = isNotInArray(array, number);
        if (notInArray) {
            System.out.println("Không tìm thấy " + number + " trong mảng!");
        } else {
            System.out.println("Mảng sau khi xóa phần tử " + number);
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[] createArray(Scanner sc) {
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
        return array;
    }

    private static boolean isNotInArray(int[] array, int number) {
        int i;
        boolean notInArray = true;
        for (i = 0; i < array.length; i++) {
            if (number == array[i]) {
                notInArray = false;
                for (int j = i; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                array[array.length - 1] = 0;
            }
        }
        return notInArray;
    }
}
