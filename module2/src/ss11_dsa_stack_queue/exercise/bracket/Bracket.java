package ss11_dsa_stack_queue.exercise.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi kiểm tra: ");
        String str = sc.nextLine();

        if (checkPracket(bStack, str)) {
            System.out.println("Well");
        } else {
            System.out.println("Bad");
        }
    }

    private static boolean checkPracket(Stack<Character> bStack, String str) {
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (temp == '(') {
                bStack.push(temp);
            }
            if (temp == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                bStack.pop();
            }
        }

        return true;
    }
}
