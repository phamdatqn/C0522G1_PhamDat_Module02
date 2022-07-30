package regex.facility_regex;

import exception.facility.InputIDVillaException;

public class InputIDVillaRegex {
    private static final String ID_VILLA_REGEX = "^(SVVL|svvl)[-][\\d]{4}$";

    public static String getIdIDVillaRegex(String idIDVilla) throws InputIDVillaException {
        if (idIDVilla.matches(ID_VILLA_REGEX)) {
            return idIDVilla.toUpperCase();
        } else {
            throw new InputIDVillaException("LỖI: Mã Villa phải bắt đầu bằng: SVVL - 4 mã số!");
        }
    }
}
