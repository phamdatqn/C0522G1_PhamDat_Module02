package utils;

public class InputPersonUtil {
    public static String inputDegreeUtil() {
        final String[] DEGREE = {"", "Trung học", "Cao đẳng", "Đại học", "Sau Đại học"};
        int choice;
        do {
            System.out.println("Mời chọn bằng cấp: " +
                    "\n1. Trung học" +
                    "\n2. Cao đẳng" +
                    "\n3. Đại học" +
                    "\n4. Sau Đại học");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 4) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 4");
            }
        } while (choice < 1 || choice > 4);
        return DEGREE[choice];
    }

    public static String inputGenderUtil() {
        final String[] GENDER = {"", "Nam", "Nữ", "Khác"};
        int choice;
        do {
            System.out.println("Mời chọn giới tính cho nhân viên: " +
                    "\n1. Nam" +
                    "\n2. Nữ" +
                    "\n3. Khác");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 3) {
                System.out.println("Chọn sai, mời chọn từ 1 -> 3");
            }
        } while (choice < 1 || choice > 3);
        return GENDER[choice];
    }

    public static String inputPositionUtil() {
        final String[] DEGREE = {"", "Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc"};
        int choice;
        do {
            //Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
            System.out.println("Mời chọn chức vụ cho nhân viên: " +
                    "\n1. Lễ tân" +
                    "\n2. Phục vụ" +
                    "\n3. Chuyên viên" +
                    "\n4. Giám sát" +
                    "\n5. Quản lý" +
                    "\n6. Giám đốc");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 6) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 6");
            }
        } while (choice < 1 || choice > 6);
        return DEGREE[choice];
    }

    public static String inputTypeCustomerUtil() {
        final String[] DEGREE = {"", "Diamond", "Platinium", "Gold", "Silver", "Member"};
        int choice;
        do {
            System.out.println("Mời loại Khách Hàng: " +
                    "\n1. Diamond" +
                    "\n2. Platinium" +
                    "\n3. Gold" +
                    "\n4. Silver" +
                    "\n5. Member");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 5) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 5");
            }
        } while (choice < 1 || choice > 5);
        return DEGREE[choice];
    }
}
