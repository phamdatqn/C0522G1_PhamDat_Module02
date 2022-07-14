package ss10_dsa_list.exercise.mvclist.controller;

import ss10_dsa_list.exercise.mvclist.service.ITeacherService;
import ss10_dsa_list.exercise.mvclist.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        do {
            System.out.println("\n1. Thêm mới giáo viên \n" +
                    "2. Xóa giáo viên \n" +
                    "3. Xem danh sách giáo viên \n" +
                    "4. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                   iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
