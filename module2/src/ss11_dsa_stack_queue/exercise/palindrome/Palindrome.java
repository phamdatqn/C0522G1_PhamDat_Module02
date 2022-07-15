package ss11_dsa_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi để kiểm tra palindrome: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.substring(i, i + 1));
            queue.offer(str.substring(i, i + 1));
        }


        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                System.out.println("Không phải chuỗi palindrome");
                break;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("là chuỗi palindrome");
        }
    }
}
