package utils.person_untils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputDayCustomerUtil {
    public static boolean isDate(String date) {
        Date year;
        double age;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            year = dateFormat.parse(date);
            age = ((new Date().getTime() - year.getTime()) / 31557600000l);
            if (age < 18 || age > 100) {
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
