package utils.person_untils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputDayEmployeeUtil {
//    public static Date getDate(String target) {
//        Scanner scanner = new Scanner(System.in);
//
//        Date year;
//        double age;
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        while (true) {
//            try {
//                year = dateFormat.parse(InputUtil.getString(target));
//                age = ((new Date().getTime() - year.getTime()) / 31557600000l);
//                if (age < 18 || age > 60) {
//                    throw new InputAgeException("Tuổi của bạn phải lớn hơn 18 & nhỏ hơn 60");
//                }
//                break;
//            } catch (ParseException | InputAgeException e) {
//                e.printStackTrace();
//                System.out.println(" ");
//            }
//        }
//        return year;
//    }


    public static boolean isDate(String date) {
        Date year;
        double age;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            year = dateFormat.parse(date);
            age = ((new Date().getTime() - year.getTime()) / 31557600000l);
            if (age < 18 || age > 60) {
                return false;
            } else {
                return true;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println(" ");
        }
        return true;
    }
}
