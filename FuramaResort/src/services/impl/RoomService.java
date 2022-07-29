package services.impl;

import exception.InputFreeServiceException;
import exception.InputIDRoomException;
import exception.InputNameFacilityException;
import models.Room;
import regex.InputFreeServiceRegex;
import regex.InputIDRoomRegex;
import regex.InputNameFacilityRegex;
import services.IRoomService;
import utils.IORoomUtil;
import utils.InputFacilityUtil;
import utils.InputUtil;

import java.util.LinkedHashMap;
import java.util.Map;

public class RoomService implements IRoomService {
    Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();

    private Room infoRoom(String idRoom) {
        String nameRoom;
        while (true) {
            try {
                nameRoom = InputNameFacilityRegex.getNameFacilityRegex(InputUtil.getString("Nhập tên Room: "));
                break;
            } catch (InputNameFacilityException e) {
                e.printStackTrace();
            }
        }

        double useArea = InputFacilityUtil.getUseArea("Nhập vào diện tích sử dụng: ");

        double rentalCosts = InputFacilityUtil.getRentalCosts("Nhập vào chi phí thuê: ");

        int maxPeople = InputFacilityUtil.getMaxPeople("Nhập vào số lượng người tối đa: ");

        String typeRental = InputFacilityUtil.inputTypeRentalUtil();

        String freeService;
        while (true) {
            try {
                freeService = InputFreeServiceRegex.getFreeServiceRegex(InputUtil.getString("Nhập dịch vụ đi kèm: "));
                break;
            } catch (InputFreeServiceException e) {
                e.printStackTrace();
                System.out.println(" ");
            }
        }

        return new Room(idRoom, nameRoom, useArea, rentalCosts, maxPeople, typeRental, freeService);
    }


    @Override
    public void add() {
        System.out.println("========== ADD NEW ROOM ==========\n");
        roomIntegerMap = IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        Room room;
        String idRoom;
        while (true) {
            try {
                idRoom = InputIDRoomRegex.getIdIDRoomRegex(InputUtil.getString("Nhập mã Room: "));
                for (Room item : roomIntegerMap.keySet()) {
                    if (item.getIdFacility().equals(idRoom)) {
                        throw new InputIDRoomException("LỖI: Mã " + idRoom + " này đã tồn tại");
                    }
                }
                break;
            } catch (InputIDRoomException e) {
                e.printStackTrace();
                System.out.println(" ");
            }
        }
        room = infoRoom(idRoom);
        roomIntegerMap.put(room, 0);
        IORoomUtil.writeRoom(IORoomUtil.PATH_ROOM, roomIntegerMap);
        System.out.println("\nThêm mới " + idRoom + " thành công !");
    }

    @Override
    public void remove() {

        roomIntegerMap = IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        String idRemove = InputFacilityUtil.getIdFacility("Nhập mã Room cần xóa: ");
        boolean iFlag = false;
        for (Room item : roomIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idRemove)) {
                int chooseYesNo = InputUtil.getInt("Bạn chắc chắn muốn xóa?\n1. Có" +
                        "\n2. Không");
                if (chooseYesNo == 1) {
                    roomIntegerMap.remove(item);

                    IORoomUtil.writeRoom(IORoomUtil.PATH_ROOM, roomIntegerMap);
                    System.out.println("đã xóa Room có mã " + idRemove + " thành công!");
                }
                iFlag = true;
                break;
            }
        }
        if (!iFlag) {
            System.out.println("Không tìm mã Room: " + idRemove);
        }
    }


    @Override
    public void edit() {
        boolean flag = false;
        roomIntegerMap = IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        String idFind;
        idFind = InputFacilityUtil.getIdFacility("Nhập vào mã House cần sửa: ");
        idFind = idFind.toUpperCase();
        for (Room item : roomIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idFind)) {
                System.out.println("\nThông tin Room sửa là:\n" + item);
                while (true) {
                    try {
                        item.setNameFacility(InputNameFacilityRegex.getNameFacilityRegex(InputUtil.getString("Nhập tên Room mới: ")));
                        break;
                    } catch (InputNameFacilityException e) {
                        e.printStackTrace();
                        System.out.println(" ");
                    }
                }

                item.setUseArea(InputFacilityUtil.getUseArea("Nhập diện tích mới: "));

                item.setRentalCosts(InputFacilityUtil.getRentalCosts("Nhập phí thuê mới: "));

                item.setMaxPeople(InputFacilityUtil.getMaxPeople("Nhập số lượng người"));

                item.setTypeRental(InputFacilityUtil.inputTypeRentalUtil());

                while (true) {
                    try {
                        item.setFreeService(InputFreeServiceRegex.getFreeServiceRegex(InputUtil.getString("Nhập dịch vụ đi kèm")));
                        break;
                    } catch (InputFreeServiceException e) {
                        e.printStackTrace();
                        System.out.println(" ");
                    }
                }

                IORoomUtil.writeRoom(IORoomUtil.PATH_ROOM, roomIntegerMap);
                System.out.println("Đã cập nhập thành công Room có mã " + idFind);
                flag = true;
                roomIntegerMap.clear();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy mã Room: " + idFind);
        }

    }

    @Override
    public void findID() {
        roomIntegerMap = IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        boolean iFlag = false;
        String idFind = InputFacilityUtil.getIdFacility("Nhập mã Room cần tìm: ");
        idFind = idFind.toUpperCase();
        for (Room item : roomIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idFind)) {
                System.out.println(item);
                iFlag = true;
                break;
            }
        }
        if (!iFlag) {
            System.out.println("\nKhông tìm thấy thông tin mã Room: " + idFind);
        }

    }

    @Override
    public void findName() {
        roomIntegerMap = IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        boolean iFlag = false;
        String nameFind = InputUtil.getString("Nhập tên Room: ");
        nameFind = nameFind.toLowerCase().trim();
        int count = 0;

        for (Room item : roomIntegerMap.keySet()) {
            if (item.getNameFacility().toLowerCase().contains(nameFind)) {
                if (count == 0) {
                    System.out.println("\nDanh sách Room liên quan tới tên: " + nameFind);
                }
                count++;
                System.out.println(item);
                iFlag = true;
            }
        }
        if (!iFlag) {
            System.out.println("\nKhông tìm thấy thông tin tên Room: " + nameFind);
        }
    }


    @Override
    public void displayAll() {
        System.out.print("\nDanh sách room hiện có:");
        Map<Room, Integer> roomIntegerMap = IORoomUtil.readRoom(IORoomUtil.PATH_ROOM);
        for (Room item : roomIntegerMap.keySet()) {
            System.out.println(item);
        }

    }
}
