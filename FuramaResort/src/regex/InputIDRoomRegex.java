package regex;

import exception.InputIDRoomException;

public class InputIDRoomRegex {
    private static final String ID_ROOM_REGEX = "^(SVRO|svro)[-][\\d]{4}$";

    public static String getIdIDRoomRegex(String idRoom) throws InputIDRoomException {
        if (idRoom.matches(ID_ROOM_REGEX)) {
            return idRoom.toUpperCase();
        } else {
            throw new InputIDRoomException("LỖI: Mã Room phải bắt đầu bằng: SVRO - 4 mã số!");
        }
    }
}
