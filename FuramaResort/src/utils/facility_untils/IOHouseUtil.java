package utils.facility_untils;

import models.model_facility.House;
import utils.IOFileUtil;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IOHouseUtil extends IOFileUtil {
    public static String PATH_HOUSE = "FuramaResort/src/data/house.csv";

    public static Map<House, Integer> readHouse(String path) {
        List<String> data = readFile(path);
        Map<House, Integer> housesData = new LinkedHashMap();
        String[] arrProperty;
        for (String item : data) {
            item = item.replaceAll(",", ".");
            arrProperty = item.split("\\$\\$");
            housesData.put(new House(arrProperty[0], arrProperty[1], Double.parseDouble(arrProperty[2].trim()),
                    Double.parseDouble(arrProperty[3].trim()), Integer.parseInt(arrProperty[4]),
                    arrProperty[5], arrProperty[6], Integer.parseInt(arrProperty[7])), Integer.parseInt(arrProperty[8]));
        }
        return housesData;
    }

    public static void writeHouse(String path, Map<House, Integer> houseIntegerMap) {
        StringBuilder data = new StringBuilder();
        data.append("1:Mã dịch vụ - 2: Tên dịch vụ - 3:Diện tích sử dụng - 4:Chi phí thuê - 5:Số lượng người tối đa - 6:Loại cho thuê - 7:Tiêu chuẩn phòng - 8: Số tầng- 9:booking\n");
        for (House house : houseIntegerMap.keySet()) {
            data.append(house.getInfo()).append("$$").append(houseIntegerMap.get(house)).append("\n");
        }

        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
