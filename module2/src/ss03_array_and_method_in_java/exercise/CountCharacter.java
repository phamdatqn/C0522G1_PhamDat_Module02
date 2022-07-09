package ss03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.println("Nhập ký tự cần đếm:");
        Character chars = sc.nextLine().charAt(0);

        int count = getCount(str, chars);

        if (count == 0) {
            System.out.println("Trong chuỗi không có ký tự " + chars);
        } else {
            System.out.println("Số lầ xuất hiện của " + chars + " là: " + count);
        }
    }

    private static int getCount(String str, Character chars) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chars == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
