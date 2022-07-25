package utils;

public class InputDegreeUtil {

    static final String[] DEGREE = {"", "Trung học", "Cao đẳng", "Đại học", "Sau Đại học"};

    public static String inputtDegreeUtil() {
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
}
