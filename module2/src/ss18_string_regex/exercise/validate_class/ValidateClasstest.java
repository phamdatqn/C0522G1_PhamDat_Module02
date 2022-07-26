package ss18_string_regex.exercise.validate_class;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ValidateClasstest {
    private static final String CLASS_REGEX = "^[CAP][\\d]{4}[G-M]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Mời nhập lớp: ");
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
