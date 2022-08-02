package regex.person_regex;

import exception.person.InputIDEmloyeeException;

public class InputIDEmployeeRegex {
    private static final String IDEMLOYEE_REGEX = "^(EM|em)[-][\\d]{4}$";

    public static String getIdEmloyeeRegex(String idEmloyee) throws InputIDEmloyeeException {
        if (idEmloyee.matches(IDEMLOYEE_REGEX)) {
            return idEmloyee.toUpperCase();
        } else {
            throw new InputIDEmloyeeException("LỖI: Mã nhân viên phải bắt đầu bằng chữ EM + 4 mã số! ");
        }
    }
}
