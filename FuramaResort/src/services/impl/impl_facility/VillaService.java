package services.impl.impl_facility;

import exception.facility.InputIDVillaException;
import exception.facility.InputNameFacilityException;
import models.model_facility.Villa;
import regex.facility_regex.InputIDVillaRegex;
import regex.facility_regex.InputNameFacilityRegex;
import services.IVillaService;
import utils.facility_untils.IOVillaUtil;
import utils.facility_untils.InputFacilityUtil;
import utils.InputUtil;

import java.util.LinkedHashMap;
import java.util.Map;

public class VillaService implements IVillaService {
    Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();

    private Villa infoVilla(String idFacility) {

        String nameVilla = InputFacilityUtil.getNameFacility();

        double useArea = InputFacilityUtil.getUseArea("Nhập diện tích Villa: ");

        double rentalCosts = InputFacilityUtil.getRentalCosts("Nhập vào phí cho thuê Villa: ");

        int maxPeople = InputFacilityUtil.getMaxPeople("Nhập vào số lượng người tối đa: ");

        String typeRental = InputFacilityUtil.inputTypeRentalUtil();

        String roomStandard = InputFacilityUtil.inputRoomStandardUtil();

        int numberFloors = InputFacilityUtil.getNumberFloors();

        double swimmingPoolArea = InputFacilityUtil.getSwimmingPoolArea();

        return new Villa(idFacility, nameVilla, useArea, rentalCosts, maxPeople, typeRental, roomStandard, numberFloors, swimmingPoolArea);
    }


    @Override
    public void add() {
        System.out.println("========== ADD NEW VILLA ==========\n");
        villaIntegerMap = IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);
        Villa villa;
        String idVilla;
        while (true) {
            try {
                idVilla = InputIDVillaRegex.getIdIDVillaRegex(InputUtil.getString("Nhập mã Villa: "));
                for (Villa item : villaIntegerMap.keySet()) {
                    if (item.getIdFacility().equals(idVilla)) {
                        throw new InputIDVillaException("LỖI: mã " + idVilla + " này đã tồn tại");
                    }
                }
                break;
            } catch (InputIDVillaException e) {
                e.printStackTrace();
                System.out.print("");
            }
        }
        villa = infoVilla(idVilla);
        villaIntegerMap.put(villa, 0);
        IOVillaUtil.writeVilla(IOVillaUtil.PATH_VILLA, villaIntegerMap);
        System.out.println("\nThêm mới mã " + idVilla + " Villa thành công !");
    }

    @Override
    public void remove() {
        villaIntegerMap = IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);
        String idRemove = InputFacilityUtil.getIdFacility("Nhập mã Villa cần xóa: ");
        boolean iFlag = false;
        for (Villa item : villaIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idRemove)) {
                int chooseYesNo = InputUtil.getInt("Bạn chắc chắn muốn xóa?\n1. Có" +
                        "\n2. Không");
                if (chooseYesNo == 1) {
                    villaIntegerMap.remove(item);

                    IOVillaUtil.writeVilla(IOVillaUtil.PATH_VILLA, villaIntegerMap);
                    System.out.println("đã xóa Villa có mã " + idRemove + " thành công!");
                }
                iFlag = true;
                break;
            }
        }
        if (!iFlag) {
            System.out.println("Không tìm mã Villa: " + idRemove);
        }
    }


    @Override
    public void edit() {

        boolean flag = false;
        villaIntegerMap = IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);
        String idFind;
        idFind = InputFacilityUtil.getIdFacility("Nhập vào mã Villa cần sửa: ");
        idFind = idFind.toUpperCase();
        for (Villa item : villaIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idFind)) {
                System.out.println("\nThông tin Villa sửa là:\n" + item);
                while (true) {
                    try {
                        item.setNameFacility(InputNameFacilityRegex.getNameFacilityRegex(InputUtil.getString("Nhập tên Villa mới: ")));
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

                item.setNumberFloors(InputFacilityUtil.getNumberFloors());

                IOVillaUtil.writeVilla(IOVillaUtil.PATH_VILLA, villaIntegerMap);
                System.out.println("Đã cập nhập thành công Villa có mã " + idFind);
                flag = true;
                villaIntegerMap.clear();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy mã Villa: " + idFind);
        }
    }

    @Override
    public void findID() {

        villaIntegerMap = IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);
        boolean iFlag = false;
        String idFind = InputFacilityUtil.getIdFacility("Nhập mã Villa cần tìm: ");
        idFind = idFind.toUpperCase();
        for (Villa item : villaIntegerMap.keySet()) {
            if (item.getIdFacility().equals(idFind)) {
                System.out.println(item);
                iFlag = true;
                break;
            }
        }
        if (!iFlag) {
            System.out.println("\nKhông tìm thấy thông tin mã Villa: " + idFind);
        }
    }

    @Override
    public void findName() {
        villaIntegerMap = IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);
        boolean iFlag = false;
        String nameFind = InputUtil.getString("Nhập tên Villa: ");
        nameFind = nameFind.toLowerCase().trim();
        int count = 0;

        for (Villa item : villaIntegerMap.keySet()) {
            if (item.getNameFacility().toLowerCase().contains(nameFind)) {
                if (count == 0) {
                    System.out.println("\nDanh sách Villa liên quan tới tên: " + nameFind);
                }
                count++;
                System.out.println(item);
                iFlag = true;
            }
        }
        if (!iFlag) {
            System.out.println("\nKhông tìm thấy thông tin tên Villa: " + nameFind);
        }

    }

    @Override
    public void displayAll() {
        System.out.print("\nDanh sách Villa hiện có:");
        Map<Villa, Integer> villaIntegerMap = IOVillaUtil.readVilla(IOVillaUtil.PATH_VILLA);
        for (Villa item : villaIntegerMap.keySet()) {
            System.out.println(item);
        }
    }
}
