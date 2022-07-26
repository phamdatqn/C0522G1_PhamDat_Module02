package exercise_haitutor.mvclist_version2.controller;

import exercise_haitutor.mvclist_version2.util.InputUtil;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    public static void menuController() throws IOException {
        StudenController studentController = new StudenController();
        TeacherController teacherController = new TeacherController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n========== PHẦN MỀM QUẢN LÝ NHÂN SỰ CODEGYM ==========\n" +
                    "1. Quản lí học sinh.\n" +
                    "2. Quản lí giảng viên \n" +
                    "3. Thoát chương trình");

            int choose = InputUtil.getInt("Mời bạn nhập lựa chọn: ");
            switch (choose) {
                case 1: {
                    studentController.menuStudent();
                    break;
                }
                case 2: {
                    teacherController.menuTeacher();
                    break;
                }
                case 3: {
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    System.exit(1);
                }
            }
        } while (true);
    }
}
