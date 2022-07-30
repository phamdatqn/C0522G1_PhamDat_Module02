package regex.facility_regex;

import exception.facility.InputTypeRentalException;

public class InputTypeRentalRegex {
    private static final String TYPE_RENTAL_REGEX = "(thang|ngay|gio|tháng|ngày|giờ)";

    public static String getTypeRentalRegex(String target) throws InputTypeRentalException {
        if (target.matches(TYPE_RENTAL_REGEX)) {
            target = target.toLowerCase().trim();
            target = target.substring(0, 1).toUpperCase() + target.substring(1);
        } else {
            throw new InputTypeRentalException("LỖI: chỉ được nhập theo tháng/ngày/giờ, mời nhập lại!!!");
        }
        return target;
    }
}
