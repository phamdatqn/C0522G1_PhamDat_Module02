package regex;

import exception.person.InputIDCardException;

public class InputIdCardRegex {
    private static final String CARD_REGEX = "^([\\d]{9})|([\\d]{12})$";

    public static String getIdCardRegex(String idCard) throws InputIDCardException {
        if (idCard.matches(CARD_REGEX)) {
            return idCard;
        } else {
            throw new InputIDCardException("Nhập sai,CMND/CCCD phải có 9 hoặc 12 số mời nhập lại: ");
        }
    }
}
