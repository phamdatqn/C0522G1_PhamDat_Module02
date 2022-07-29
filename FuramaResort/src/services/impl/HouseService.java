package services.impl;

import exception.InputIDHouseException;
import exception.InputNameFacilityException;
import exception.InputNumberFloorsException;
import models.House;
import regex.InputIDHouseRegex;
import regex.InputNameFacilityRegex;
import services.IHouseService;
import utils.IOHouseUtil;
import utils.InputFacilityUtil;
import utils.InputUtil;

import java.util.LinkedHashMap;
import java.util.Map;

public class HouseService implements IHouseService {
    Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();

    private House infoHouse(String idHouse) {
        String nameHouse = InputFacilityUtil.getNameFacility();

        double useArea = InputFacilityUtil.getUseArea("Nhập diện tích sử dụng: ");

        double rentalCosts = InputFacilityUtil.getRentalCosts("Nhập phí cho thuê: ");

        int maxPeople = InputFacilityUtil.getMaxPeople("Nhập số lượng người tối đa");

        String typeRental = InputFacilityUtil.inputTypeRentalUtil();

        String roomStandard = InputFacilityUtil.inputRoomStandardUtil();

        int numberFloors = InputFacilityUtil.getNumberFloors();

        return new House(idHouse, nameHouse, useArea, rentalCosts, maxPeople, typeRental, roomStandard, numberFloors);
    }




    @Override
    public void add() {
        System.out.println("========== ADD NEW HOUSE ==========\n");
        houseIntegerMap = IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        House house;
        String idHouse;
        while (true) {
            try {
                idHouse = InputIDHouseRegex.getIdHouseRegex(InputUtil.getString("Nhập mã dịch vụ House: "));
                for (House item : houseIntegerMap.keySet()) {
                    if (item.getIdFacility().equals(idHouse)) {
                        throw new InputIDHouseException("LỖI: Mã " + idHouse + " này đã tồn tại");
                    }
                }
                break;
            } catch (InputIDHouseException e) {
                e.printStackTrace();
            }
        }
        house = infoHouse(idHouse);
        houseIntegerMap.put(house, 0);
        IOHouseUtil.writeHouse(IOHouseUtil.PATH_HOUSE, houseIntegerMap);
        System.out.println("\nThêm mới mã " + idHouse + " thành công !");

    }

    @Override
    public void remove() {
        houseIntegerMap = IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        String idRemove = InputFacilityUtil.getIdFacility("Nhập mã House cần xóa: ");
        boolean iFlag = false;
        for (House item : houseIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idRemove)) {
                int chooseYesNo = InputUtil.getInt("Bạn chắc chắn muốn xóa?\n1. Có" +
                        "\n2. Không");
                if (chooseYesNo == 1) {
                    houseIntegerMap.remove(item);

                    IOHouseUtil.writeHouse(IOHouseUtil.PATH_HOUSE, houseIntegerMap);
                    System.out.println("đã xóa House có mã " + idRemove + " thành công!");
                }
                iFlag = true;
                break;
            }
        }
        if (!iFlag) {
            System.out.println("Không tìm mã House: " + idRemove);
        }
    }

    @Override
    public void edit() {
        boolean flag = false;
        houseIntegerMap = IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        String idFind;
        idFind = InputFacilityUtil.getIdFacility("Nhập vào mã House cần sửa: ");
        idFind = idFind.toUpperCase();
        for (House item : houseIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idFind)) {
                System.out.println("\nThông tin House sửa là:\n" + item);
                while (true) {
                    try {
                        item.setNameFacility(InputNameFacilityRegex.getNameFacilityRegex(InputUtil.getString("Nhập tên House mới: ")));
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

                item.setRoomStandard(InputFacilityUtil.inputRoomStandardUtil());

                IOHouseUtil.writeHouse(IOHouseUtil.PATH_HOUSE, houseIntegerMap);
                System.out.println("Đã cập nhập thành công House có mã " + idFind);
                flag = true;
                houseIntegerMap.clear();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy mã House: " + idFind);
        }
    }

    @Override
    public void findID() {
        houseIntegerMap = IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        boolean iFlag = false;
        String idFind = InputFacilityUtil.getIdFacility("Nhập mã House cần tìm: ");
        idFind = idFind.toUpperCase();
        for (House item : houseIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idFind)) {
                System.out.println(item);
                iFlag = true;
                break;
            }
        }
        if (!iFlag) {
            System.out.println("\nKhông tìm thấy thông tin mã House: " + idFind);
        }
    }

    @Override
    public void findName() {
        houseIntegerMap = IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        boolean iFlag = false;
        String nameFind = InputUtil.getString("Nhập tên House: ");
        nameFind = nameFind.toLowerCase().trim();
        int count = 0;

        for (House item : houseIntegerMap.keySet()) {
            if (item.getNameFacility().toLowerCase().contains(nameFind)) {
                if (count == 0) {
                    System.out.println("\nDanh sách House liên quan tới tên: " + nameFind);
                }
                count++;
                System.out.println(item);
                iFlag = true;
            }
        }
        if (!iFlag) {
            System.out.println("\nKhông tìm thấy thông tin tên House: " + nameFind);
        }

    }


    @Override
    public void displayAll() {
        System.out.print("Danh sách house hiện có:");
        Map<House, Integer> houseIntegerMap = IOHouseUtil.readHouse(IOHouseUtil.PATH_HOUSE);
        for (House item : houseIntegerMap.keySet()) {
            System.out.println(item);
        }
    }
}

