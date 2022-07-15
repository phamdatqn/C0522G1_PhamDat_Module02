package ss11_dsa_stack_queue.exercise.reverse_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayStack<I> {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Stack<Integer> arrayReverse = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử mảng:");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ :" + (i + 1));
            array.push(sc.nextInt());
        }

        System.out.println("Mảng vừa nhập : " + array);

        while (!array.isEmpty()) {
            arrayReverse.push(array.pop());
        }
        for (Integer arr : arrayReverse) {
            array.push(arr);
        }

        System.out.println("Mảng sau khi đảo: " + array);
    }
}
