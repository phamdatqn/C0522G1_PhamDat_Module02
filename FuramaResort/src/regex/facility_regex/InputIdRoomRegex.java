package regex.facility_regex;

import exception.facility.InputIdRoomException;

public class InputIdRoomRegex {
    private static final String ID_ROOM_REGEX = "^(SVRO|svro)[-][\\d]{4}$";

    public static String getIdIDRoomRegex(String idRoom) throws InputIdRoomException {
        if (idRoom.matches(ID_ROOM_REGEX)) {
            return idRoom.toUpperCase();
        } else {
            throw new InputIdRoomException("LỖI: Mã Room phải bắt đầu bằng: SVRO - 4 mã số!");
        }
    }
}
