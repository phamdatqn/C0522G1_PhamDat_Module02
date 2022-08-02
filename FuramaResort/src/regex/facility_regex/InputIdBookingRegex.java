package regex.facility_regex;

import exception.facility.InputIDBookingException;

public class InputIdBookingRegex {
    private static final String ID_HOUSE_REGEX = "^(BK|bk)[-][\\d]{4}$";

    public static String getIdHouseRegex(String idHouse) throws InputIDBookingException {
        if (idHouse.matches(ID_HOUSE_REGEX)) {
            return idHouse.toUpperCase();
        } else {
            throw new InputIDBookingException("LỖI: Mã Booking phải bắt đầu bằng: BK - 4 mã số!");
        }
    }
}
