package regex.facility_regex;

import exception.facility.InputIdFacilityException;
import exception.facility.InputIdHouseException;

public class InputIdFacilityRegex {
    private static final String ID_FACILITY_REGEX = "^(SVHO|svho|SVVL|svvl|SVRO|svro)[-][\\d]{4}$";

    public static String getIdFacilityRegex(String IdFacility) throws InputIdFacilityException {
        if (IdFacility.matches(ID_FACILITY_REGEX)) {
            return IdFacility.toUpperCase();
        } else {
            throw new InputIdFacilityException("LỖI: Mã dịch vụ phải bắt đầu bằng: SVHO|SVVL|SVRO - 4 mã số!");
        }
    }
}
