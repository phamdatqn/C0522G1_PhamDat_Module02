package ss14_sort.exercise.insert_bysort.controller;

import ss14_sort.exercise.insert_bysort.model.InsertSortByStep;
import ss14_sort.exercise.insertsort.model.InsertSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStepController {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhập độ dài mảng: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Nhập phần tử thứ: "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("mảng đã nhập: \n"+ Arrays.toString(arr)+"\n");

        InsertSortByStep.insertSortByStep(arr);

        System.out.println("Mảng sau khi sắp xếp chèn hoàn chỉnh: \n"+Arrays.toString(arr));

    }
}
