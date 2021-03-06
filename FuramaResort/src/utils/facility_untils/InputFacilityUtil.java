package utils.facility_untils;

import exception.facility.*;
import regex.facility_regex.InputIdVillaRegex;
import regex.facility_regex.InputNameFacilityRegex;
import utils.InputUtil;

public class InputFacilityUtil {
    public static double getUseArea(String target) {
        double tryUseAre;

        while (true) {
            try {
                tryUseAre = InputUtil.getDouble(target);
                if (tryUseAre < 29) {
                    throw new InputUseAreaException("LỖI: Diện tích phải lớn hơn 30");
                }
                break;
            } catch (InputUseAreaException e) {
                e.printStackTrace();
                System.out.print("");
            }

        }
        return tryUseAre;
    }

    public static double getRentalCosts(String target) {
        double tryRentalCosts;

        while (true) {
            try {
                tryRentalCosts = InputUtil.getDouble(target);
                if (tryRentalCosts < 0) {
                    throw new InputUseAreaException("LỖI: Phí thuê phải > 0");
                }
                break;
            } catch (InputUseAreaException e) {
                e.printStackTrace();
                System.out.print("");
            }

        }
        return tryRentalCosts;
    }

    public static int getMaxPeople(String target) {
        int tryMaxPeople;
        while (true) {
            try {
                tryMaxPeople = InputUtil.getInt(target);
                if (tryMaxPeople < 1 || tryMaxPeople > 19) {
                    throw new InputMaxPeopleException("LỖI: Số lượng người chỉ từ 1 - 19");
                }
                break;
            } catch (InputMaxPeopleException e) {
                e.printStackTrace();
                System.out.print("");
            }

        }
        return tryMaxPeople;
    }

    public static String getIdFacility(String target) {
        String idFacility;

        idFacility = InputFacilityUtil.getIdFacility(InputUtil.getString("Nhập mã dịch vụ: "));
                return idFacility;
    }

    public static String inputRoomStandardUtil() {
        final String[] DEGREE = {"", "Normal", "Pro", "Vip"};
        int choice;
        do {
            System.out.println("Mời chọn tiêu chuẩn phòng: " +
                    "\n1. Normal" +
                    "\n2. Pro" +
                    "\n3. Vip");

            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 3) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 3");
            }
        } while (choice < 1 || choice > 3);
        return DEGREE[choice];
    }

    public static int getNumberFloors() {
        int numberFloors;
        while (true) {
            try {
                numberFloors = InputUtil.getInt("Nhập vào số tầng: ");
                if (numberFloors < 0) {
                    throw new InputNumberFloorsException("LỖI: số tầng phải lớn hơn 0");
                }
                break;
            } catch (InputNumberFloorsException e) {
                e.printStackTrace();
            }
        }
        return numberFloors;
    }

    public static String inputTypeRentalUtil() {
        final String[] DEGREE = {"", "Theo giờ", "Theo ngày", "Theo tháng", "Theo năm"};
        int choice;
        do {
            System.out.println("Mời chọn loại cho thuê: " +
                    "\n1. Theo giờ" +
                    "\n2. Theo ngày" +
                    "\n3. Theo tháng" +
                    "\n4. Theo năm");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 4) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 4");
            }
        } while (choice < 1 || choice > 4);
        return DEGREE[choice];
    }

    public static String getNameFacility() {
        String nameFacility;
        while (true) {
            try {
                nameFacility = InputNameFacilityRegex.getNameFacilityRegex(InputUtil.getString("Nhập tên dịch vụ: "));
                break;
            } catch (InputNameFacilityException e) {
                e.printStackTrace();
            }
        }
        return nameFacility;
    }

    public static double getSwimmingPoolArea() {
        double swimmingPoolArea;
        while (true) {
            try {
                swimmingPoolArea = InputUtil.getDouble("Nhập vào diện tích hồ bơi: ");
                if (swimmingPoolArea < 30) {
                    throw new InputSwimmingPoolAreaException("LỖI: Diện tích hồ bơi phải lớn hơn 30");
                }
                break;
            } catch (InputSwimmingPoolAreaException e) {
                e.printStackTrace();
                System.out.print("");
            }
        }
        return swimmingPoolArea;
    }

    public static String inputNameService() {
        final String[] DEGREE = {"", "Căn hộ", "Homestay", "Motel",
                "Phòng đơn vip", "Phòng đơn", "Phòng đôi vip", "Phòng đôi",
                "Villa đơn lập,Villa song lập", "Villa liền kề"};
        int choice;
        do {
            System.out.println("Mời chọn tên dịch vụ: " +
                    "\n***** HOUSE *****" +
                    "\n1. Căn hộ" +
                    "\n2. Homestay" +
                    "\n3. Motel" +

                    "\n***** ROOM *****" +
                    "\n4. Phòng đơn vip" +
                    "\n5. Phòng đơn" +
                    "\n6. Phòng đôi vip" +
                    "\n7. Phòng đôi" +

                    "\n***** VILLA *****" +
                    "\n8. Villa đơn lậpl" +
                    "\n9. Villa song lập" +
                    "\n10. Villa liền kề");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 10) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 4");
            }
        } while (choice < 1 || choice > 10);
        return DEGREE[choice];
    }

    public static String inputTypeService(){
        final String[] DEGREE = {"", "House", "Room", "Villa"};
        int choice;
        do {
            System.out.println("Mời chọn tên dịch vụ: " +
                    "\n1. House" +
                    "\n2. Room" +
                    "\n3. Villa" );
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 3) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 4");
            }
        } while (choice < 1 || choice > 3);
        return DEGREE[choice];

    }

}

