package regex;

import exception.InputEmailException;


public class InputRegexEmailUtil {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,2}$";

    public static String getEmail(String email) throws InputEmailException {
        if (email.matches(EMAIL_REGEX)) {
            return email;
        } else {
            throw new InputEmailException("Nhập sai định dạng email, mời nhập lại: ");
        }
    }
}
