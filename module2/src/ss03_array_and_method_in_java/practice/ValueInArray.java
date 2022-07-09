package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class ValueInArray {//tìm giá trị trong mảng

    public static void main(String[] args) {
        String[] students = {"Đạt", "Tùng", "Ân", "Trí", "Hùng", "Học", "Thuyên", "Đại", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên học sinh:");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vị trí của " + inputName + " là: " + i);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Không có " + inputName + " trong list.");
        }
    }

}
