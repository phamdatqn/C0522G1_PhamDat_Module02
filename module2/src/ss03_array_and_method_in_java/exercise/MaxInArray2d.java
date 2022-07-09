package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số dòng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số cột của mảng: ");
        int col = Integer.parseInt(sc.nextLine());

        int[][] array2D;
        array2D = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử thứ [" + (i) + "][" + (j) + "] của mảng: ");
                array2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Mảng đã nhập");
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }

        int max = array2D[0][0];
        int colIndex = 0;
        int rowIndex = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println("phần tử max trong mảng 2 chiều là:  " + max + " Tại vị trí hàng số " + rowIndex + " cột số " + colIndex);
    }
}
