package regex.facility_regex;

import exception.facility.InputIdHouseException;

public class InputIdHouseRegex {
    private static final String ID_HOUSE_REGEX = "^(SVHO|svho)[-][\\d]{4}$";

    public static String getIdHouseRegex(String idHouse) throws InputIdHouseException {
        if (idHouse.matches(ID_HOUSE_REGEX)) {
            return idHouse.toUpperCase();
        } else {
            throw new InputIdHouseException("LỖI: Mã House phải bắt đầu bằng: SVHO - 4 mã số!");
        }
    }
}
