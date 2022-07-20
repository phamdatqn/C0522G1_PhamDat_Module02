package ss14_sort.exercise.insert_bysort.model;


import java.util.Arrays;

public class InsertSortByStep {
    public static void insertSortByStep(int[] arr){
        int k=1;
        for (int i = 1;i<arr.length;i++){
            int key = arr[i];
            int j;
            int indexInsert = 0;
            for (j=i-1;j>=0 && arr[j]>key;j--,k++){
                System.out.println("Bước " +k+": lấy giá trị "+arr[j+1]+" gắn vào temp & dời "+arr[j]+" sang vị trí của "+arr[j+1]);
                arr[j+1]=arr[j];
                indexInsert=arr[j+1];

            }
            arr[j+1]=key;
            System.out.println("Chèn temp vào vị trí củ của "+indexInsert+" ta được: "+Arrays.toString(arr)+"\n");

        }
    }
}
