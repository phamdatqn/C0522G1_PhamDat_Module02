package utils;

import models.Villa;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IOVillaUtil extends IOFileUtil {
    public static String PATH_VILLA = "FuramaResort/src/data/villa.csv";

    public static Map<Villa, Integer> readVilla(String path) {
        List<String> data = readFile(path);
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap();
        String[] arrProperty;
        for (String item : data) {
            item=item.replaceAll(",",".");
            arrProperty = item.split("\\$\\$");
            villaIntegerMap.put(new Villa(arrProperty[0], arrProperty[1], Double.parseDouble(arrProperty[2]),
                    Double.parseDouble(arrProperty[3]), Integer.parseInt(arrProperty[4]),
                    arrProperty[5], arrProperty[6], Integer.parseInt(arrProperty[7]),
                    Double.parseDouble(arrProperty[8])), Integer.parseInt(arrProperty[9]));
        }
        return villaIntegerMap;
    }

    public static void writeVilla(String path, Map<Villa, Integer> villaIntegerMap) {
        StringBuilder data = new StringBuilder();
        data.append("1:Mã dịch vụ - 2: Tên dịch vụ - 3:Diện tích sử dụng - 4:Chi phí thuê " +
                "- 5:Số lượng người tối đa - 6:Loại cho thuê - 7:Tiêu chuẩn phòng - 8: Số tầng " +
                "- 9: Diện tích hồ bơi - 10: số lần booking.\n");
        for (Villa villa : villaIntegerMap.keySet()) {
            data.append(villa.getInfo()).append("$$").append(villaIntegerMap.get(villa)).append("\n");
        }

        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
