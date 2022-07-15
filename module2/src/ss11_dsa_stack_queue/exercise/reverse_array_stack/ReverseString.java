package ss11_dsa_stack_queue.exercise.reverse_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> arr = new Stack<>();
        Stack<String> newArr = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 1 chuỗi ký tự: ");
        String str = sc.nextLine();

        String[] arrStr = str.split(" ");

        for (String temp : arrStr) {
            arr.push(temp);
        }

        String result = "";
        while (!arr.isEmpty()) {
            result += newArr.push(arr.pop()) + " ";
        }

        System.out.println("Chuỗi sau khi đảo: " + result);

    }
}
