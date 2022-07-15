package ss11_dsa_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {// thập phân sang nhị phân

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhập vào 1 số thập phân: ");
        int number = sc.nextInt();
        int temp = number;

        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }

        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }

        System.out.println(temp + " sang nhị phân bằng: " + str);

    }
}
