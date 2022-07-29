package regex;

import exception.InputFreeServiceException;

public class InputFreeServiceRegex {
    public static final String FREE_SERVICE_REGEX = "([ ]*[^0-9 ]{2,6}[ ]+)+[^0-9]{1,6}[ ]*";

    public static String getFreeServiceRegex(String freeService) throws InputFreeServiceException {

        StringBuilder string = new StringBuilder();
        if (freeService.matches(FREE_SERVICE_REGEX)) {
            freeService = freeService.toLowerCase().trim();
            freeService = freeService.replaceAll("[ ]+", " ");
            String[] arrName = freeService.split(" ");

            for (String s : arrName) {
                string.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }
        } else {
            throw new InputFreeServiceException("LỖI: Dịch vụ không chứa ký tự đặt biệt!!!");
        }
        return string.toString().trim();

    }
}
