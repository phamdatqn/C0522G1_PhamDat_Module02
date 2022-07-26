package utils;

public class InputPositionUtil {
    static final String[] DEGREE = {"", "Quản lý", "Bảo trì", "lễ tân", "Phục vụ", "Bảo vệ"};

    public static String inputtPositionUtil() {
        int choice;
        do {
            System.out.println("Mời chọn chức vụ cho nhân viên: " +
                    "\n1. Quản lý" +
                    "\n2. Bảo trì" +
                    "\n3. lễ tân" +
                    "\n4. Phục vụ" +
                    "\n5. Bảo vệ");
            choice = InputUtil.getInt("Mời chọn: ");
            if (choice < 1 || choice > 5) {
                System.out.println("Nhập sai, mời chọn từ 1 -> 5");
            }
        } while (choice < 1 || choice > 5);
        return DEGREE[choice];
    }
}
