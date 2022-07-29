package regex;

import exception.InputEmailException;

import java.util.Locale;
import java.util.Scanner;


public class InputEmailRegex {
    private static final String EMAIL_REGEX = "[a-zA-Z]([.A-Za-z0-9_]){5,}@[A-Za-z]{2,10}(\\.[A-Za-z]{2,3}){1,2}";
    public static String getEmail(String email) throws InputEmailException {
        if (email.matches(EMAIL_REGEX)) {
            return email.toLowerCase();
        } else {
            throw new InputEmailException("Nhập sai định dạng email, mời nhập lại: ");
        }
    }
}
