package utils;

import exercise_haitutor.mvclist_version2.exception.InputNameException;

public class InputNameRegexUtil {
    private static final String NAME_REGEX = "([^0-9 ]{2,6}[ ]){1,4}[^0-9]{1,6}";

    public static String getNameUtil(String str) throws InputNameException {
        StringBuilder string = new StringBuilder();
        if (str.matches(NAME_REGEX)) {
            str = str.toLowerCase().trim();
            str = str.replaceAll("[ ]+", " ");
            String[] arrName = str.split(" ");

            for (String s : arrName) {
                string.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }
        } else {
            throw new InputNameException("Phải nhập họ và tên, mời nhập lại!!!");
        }
        return string.toString().trim();
    }

}
