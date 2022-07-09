package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumberByMainCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập kích thước của Ma trận vuông: ");
        int number = Integer.parseInt(sc.nextLine());

        int[][] array2D;
        array2D = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "][" +j+ "] của mảng: ");
                array2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Mảng đã nhập");
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }

        int sum=0;
        for (int i=0;i<array2D.length;i++){
            sum+=array2D[i][i];
        }

        System.out.println("Tổng đường chéo chính của ma trận là: "+sum);

        //tổng đường chéo phụ ma trận:
        int sumExtraCross=0;
        int length=array2D.length;
        for (int i=length-1;i>=0;i--){
            sumExtraCross+=array2D[length-1-i][i];
        }

        System.out.println("tổng chéo phụ là: "+sumExtraCross);
    }
}
