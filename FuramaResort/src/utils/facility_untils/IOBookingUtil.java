package utils.facility_untils;

import models.model_facility.Booking;
import utils.IOFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IOBookingUtil extends IOFileUtil {
    public static String PATH_BOOKING = "FuramaResort/src/data/booking.csv";

    public static Set<Booking> readBooking(String path) {
        List<String> data = readFile(path);
        Set<Booking> bookingTreeSet = new TreeSet<>();
        String[] arrProperty;
        for (String item : data) {
            item = item.replaceAll(",", ".");
            arrProperty = item.split("\\$\\$");
            bookingTreeSet.add(new Booking(arrProperty[0], arrProperty[1],
                    arrProperty[2], arrProperty[3], arrProperty[4],
                    arrProperty[5]));
        }
        return bookingTreeSet;
    }

    public static void writeBooking(String path, Set<Booking> bookingTreeSet) {
        StringBuilder data = new StringBuilder();
        data.append("1: Mã booking - 2: Ngày bắt đầu - 3: Ngày kết thúc - 4:Mã Khách hàng " +
                "- 5: Tên dịch vụ - 6: Mã dịch vụ\n");
        for (Booking booking : bookingTreeSet) {
            data.append(booking.getInfo()).append("\n");
        }
        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
