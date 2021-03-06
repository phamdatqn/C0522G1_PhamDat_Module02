package ss14_sort.exercise.insertsort.controller;

import ss14_sort.exercise.insertsort.model.InsertSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("mảng đã nhập: \n" + Arrays.toString(arr));

        InsertSort.insertSort(arr);

        System.out.println("Mảng sau khi sắp xếp chèn: \n" + Arrays.toString(arr));

    }
}
