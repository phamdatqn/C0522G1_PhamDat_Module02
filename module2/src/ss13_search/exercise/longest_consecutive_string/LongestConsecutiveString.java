package ss13_search.exercise.longest_consecutive_string;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestConsecutiveString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.get(list.size() - 1) &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }

}

