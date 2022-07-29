package regex;

import exception.InputNumberPhoneException;

public class InputPhoneNumberRegex {
    public static final String NUMBERPHONE_REGEX = "^(84|0)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";

    public static String getNumberphoneRegex(String numberPhone) throws InputNumberPhoneException {

        if (numberPhone.matches(NUMBERPHONE_REGEX)) {
            return numberPhone;
        } else {
            throw new InputNumberPhoneException("LỖI: Vui lòng nhập đúng số điện thoại: ");
        }

    }
}

