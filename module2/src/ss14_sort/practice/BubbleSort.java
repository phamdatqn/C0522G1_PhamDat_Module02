package ss14_sort.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);

    public static int[] creatArray() {

        System.out.println("Nhập vào độ dài mảng: ");
        int size = Integer.parseInt(sc.nextLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = creatArray();
        System.out.println("Mảng đã nhập: \n"+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp: \n"+Arrays.toString(arr));
    }
}
