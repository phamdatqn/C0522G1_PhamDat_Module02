package regex.facility_regex;

import exception.facility.InputIDHouseException;

public class InputIDHouseRegex {
    private static final String ID_HOUSE_REGEX = "^(SVHO|svho)[-][\\d]{4}$";

    public static String getIdHouseRegex(String idHouse) throws InputIDHouseException {
        if (idHouse.matches(ID_HOUSE_REGEX)) {
            return idHouse.toUpperCase();
        } else {
            throw new InputIDHouseException("LỖI: Mã House phải bắt đầu bằng: SVHO - 4 mã số!");
        }
    }
}
