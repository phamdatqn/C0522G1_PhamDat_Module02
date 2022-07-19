package ss13_search.exercise.recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = creatArray();
        System.out.println("Nhập vào giá trị cần tìm: ");
        int key = sc.nextInt();
        System.out.println("Số " + key + " cần tìm ở vị trí " + binarySearch(array, 0, array.length - 1, key) + " trong mảng.");

    }

    public static int[] creatArray() {

        System.out.println("Nhập vào độ dài mảng: ");

        int size = Integer.parseInt(sc.nextLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (value < array[mid]) {
                return binarySearch(array, left, mid - 1, value);
            }
            return binarySearch(array, mid + 1, right, value);

        }
        return -1;
    }
}
