package regex.facility_regex;

import exception.facility.InputIdVillaException;

public class InputIdVillaRegex {
    private static final String ID_VILLA_REGEX = "^(SVVL|svvl)[-][\\d]{4}$";

    public static String getIdIDVillaRegex(String idIDVilla) throws InputIdVillaException {
        if (idIDVilla.matches(ID_VILLA_REGEX)) {
            return idIDVilla.toUpperCase();
        } else {
            throw new InputIdVillaException("LỖI: Mã Villa phải bắt đầu bằng: SVVL - 4 mã số!");
        }
    }
}
