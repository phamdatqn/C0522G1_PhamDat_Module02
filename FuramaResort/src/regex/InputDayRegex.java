package regex;

import exception.InputDayException;

import java.util.Scanner;

public class InputDayRegex {
    private static final String DAY_REGEX = "[\\d]{2}[/](0[1-9]|1[0-2])[/](19|20)[\\d]{2}";

    public static String getBirthDay(String target) {
        Scanner scanner = new Scanner(System.in);
        String birthDay;

        while (true) {
            try {
                System.out.println(target);
                birthDay = scanner.nextLine();
                if (birthDay.matches(DAY_REGEX)) {

                    String[] arrBirthDay = birthDay.split("/");
                    int year = Integer.parseInt(arrBirthDay[2]);
                    int month = Integer.parseInt(arrBirthDay[1]);
                    int day = Integer.parseInt(arrBirthDay[0]);

                    switch (month) {
                        case 2:
                            if (checkYear(year) && day > 29) {
                                throw new InputDayException("LỖI: Năm " + year + " tháng 02 chỉ có tối đa 29 ngày!");
                            }
                            if (!checkYear(year) && day > 28) {
                                throw new InputDayException("LỖI: Năm " + year + " tháng 02 chỉ có tối đa 28 ngày!");
                            }
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day > 30) {
                                throw new InputDayException("ERR: Tháng " + month + " không được vượt quá 30 ngày!");
                            }
                        default:
                            if (day > 31) {
                                throw new InputDayException("ERR: Tháng " + month + " không được vượt quá 31 ngày!");
                            }
                    }
                    break;
                } else {
                    throw new InputDayException("ERR: Nhập sai định dạng phải nhập: dd/mm/yyyy");
                }
            } catch (InputDayException e) {
                e.printStackTrace();
            }
        }
        return birthDay;
    }

    public static boolean checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}


