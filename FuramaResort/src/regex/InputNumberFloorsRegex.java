package regex;

import exception.InputRomStandardException;

public class InputNumberFloorsRegex {
    private static final String NUMBER_FLOORS_REGEX = "(^a-z)";

    public static String getRoomStandardRegex(String target) throws InputRomStandardException {
        if (target.matches(NUMBER_FLOORS_REGEX)) {
            target = target.toLowerCase().trim();
            target = target.substring(0, 1).toUpperCase() + target.substring(1);
        } else {
            throw new InputRomStandardException("LỖI: Nhập vào tiêu chuẩn phòng: vip? pro? normal?");
        }
        return target;
    }


}
