package ss11_dsa_stack_queue.exercise.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi kiểm tra: ");
        String str = sc.nextLine();

        if (checkPracket(str)) {
            System.out.println("Well");
        } else {
            System.out.println("Bad");
        }
    }

    private static boolean checkPracket(String str) {
        Stack<Character> bStack = new Stack<>();
        
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
