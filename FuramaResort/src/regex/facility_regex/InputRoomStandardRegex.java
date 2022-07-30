package regex.facility_regex;

import exception.facility.InputRomStandardException;

public class InputRoomStandardRegex {
    private static final String ROOM_STANDARD_REGEX = "(vip|pro|normal)";

    public static String getRoomStandardRegex(String target) throws InputRomStandardException {
        if (target.matches(ROOM_STANDARD_REGEX)) {
            target = target.toLowerCase().trim();
            target = target.substring(0, 1).toUpperCase() + target.substring(1);
        } else {
            throw new InputRomStandardException("LỖI: Nhập vào tiêu chuẩn phòng: vip? pro? normal?");
        }
        return target;
    }


}
