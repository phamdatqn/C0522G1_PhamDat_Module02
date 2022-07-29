package regex;

import exception.InputIDCardException;
import exception.InputNumberPhoneException;

public class InputIdCardRegex {
    private static final String CARD_REGEX = "^[\\d]{9}$";

    public static String getIdCardRegex(String idCard) throws InputIDCardException {
        if (idCard.matches(CARD_REGEX)) {
            return idCard;
        } else {
            throw new InputIDCardException("Nhập sai,CMND phải có 9 số mời nhập lại: ");
        }
    }
}
