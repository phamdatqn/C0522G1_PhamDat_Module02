package ss10_dsa_list.mvclist.controller;

import ss10_dsa_list.mvclist.service.impl.MainService;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        StudenController studentController = new StudenController();
        TeacherController teacherController =new TeacherController();
        MainService mainService =new MainService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n========== PHẦN MỀM QUẢN LÝ NHÂN SỰ CODEGYM ==========\n" +
                    "1. Quản lí học sinh.\n" +
                    "2. Quản lí giảng viên \n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát chương trình");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    studentController.menuStudent();
                    break;
                }
                case 2: {
                    teacherController.menuTeacher();
                    break;
                }
                case 3:{
                    mainService.displayList();
                    break;
                }
                case 4: {
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    System.exit(1);
                }
            }
        } while (true);
    }
}