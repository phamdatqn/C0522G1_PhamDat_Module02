package regex;

import exception.InputNameFacilityException;

public class InputNameFacilityRegex {
    public static final String NAME_FACILITY_REGEX = "([ ]*[^0-9 ]{2,6}[ ]+)+[^0-9]{1,6}[ ]*";

    public static String getNameFacilityRegex(String nameFacility) throws InputNameFacilityException {

        StringBuilder string = new StringBuilder();
        if (nameFacility.matches(NAME_FACILITY_REGEX)) {
            nameFacility = nameFacility.toLowerCase().trim();
            nameFacility = nameFacility.replaceAll("[ ]+", " ");
            String[] arrName = nameFacility.split(" ");

            for (String s : arrName) {
                string.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }
        } else {
            throw new InputNameFacilityException("LỖI: Nhập tên dịch vụ sai, không được nhập số");
        }
        return string.toString().trim();

    }
}
