package ss13_search.exercise.longest_ascending_sequence;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestAscendingSequence {//Tìm chuỗi tăng dần có độ dài lớn nhất

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();

        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.get(list.size() - 1)) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
