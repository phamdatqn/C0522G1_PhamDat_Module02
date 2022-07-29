package regex;

import exception.InputIDCardException;
import exception.InputIDEmloyeeException;

public class InputIDEmployeeRegex {
    private static final String IDEMLOYEE_REGEX = "^[Ee][\\d]{4}$";

    public static String getIdEmloyeeRegex(String idEmloyee) throws InputIDEmloyeeException {
        if (idEmloyee.matches(IDEMLOYEE_REGEX)) {
            return idEmloyee.toUpperCase();
        } else {
            throw new InputIDEmloyeeException("LỖI: Mã nhân viên phải bắt đầu bằng chữ E + 4 mã số! ");
        }
    }
}
