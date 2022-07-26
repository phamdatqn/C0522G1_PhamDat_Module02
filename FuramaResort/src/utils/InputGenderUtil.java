package utils;

public class InputGenderUtil {
    static final String[] DEGREE = {"", "Nam", "Nữ", "Khác"};

    public static String inputGenderUtil() {
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
        return DEGREE[choice];
    }
}
