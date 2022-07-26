package ss18_string_regex.exercise.validate_numberphone;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ValidateNumberPhone {
    private static final String CLASS_REGEX = "^[\\d]{2}[-][0][1-9]{9}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Mời nhập số điện thoại: ");
                String nameClass = scanner.nextLine();
                if (nameClass.matches(CLASS_REGEX)) {
                    System.out.println("Định dạng oke!");
                    break;
                } else {
                    System.out.println("Nhập định dạng sai, mời nhập lại!");
                }
            } catch (PatternSyntaxException e) {
                e.getMessage();
            }
        }
    }
}
