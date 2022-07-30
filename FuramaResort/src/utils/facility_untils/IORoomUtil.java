package utils.facility_untils;

import models.model_facility.Room;
import utils.IOFileUtil;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IORoomUtil extends IOFileUtil {
    public static String PATH_ROOM = "FuramaResort/src/data/room.csv";

    public static Map<Room, Integer> readRoom(String path) {
        List<String> data = readFile(path);
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap();
        String[] arrProperty;
        for (String item : data) {
            item = item.replaceAll(",", ".");
            arrProperty = item.split("\\$\\$");
            roomIntegerMap.put(new Room(arrProperty[0], arrProperty[1], Double.parseDouble(arrProperty[2].trim()),
                    Double.parseDouble(arrProperty[3].trim()), Integer.parseInt(arrProperty[4]),
                    arrProperty[5], arrProperty[6]), Integer.parseInt(arrProperty[7]));
        }
        return roomIntegerMap;
    }

    public static void writeRoom(String path, Map<Room, Integer> roomIntegerMap) {
        StringBuilder data = new StringBuilder();
        data.append("1:Mã dịch vụ -- 2: Tên dịch vụ -- 3:Diện tích sử dụng -- 4:Chi phí thuê -- " +
                "5:Số lượng người tối đa -- 6:Loại cho thuê -- 7:Dịch vụ free đi kèm --8:booking\n");
        for (Room room : roomIntegerMap.keySet()) {
            data.append(room.getInfo()).append("$$").append(roomIntegerMap.get(room)).append("\n");
        }
        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
