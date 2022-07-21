package exercise_haitutor.mvclist.controller;

import exercise_haitutor.mvclist.exception.DuplicateIDException;
import exercise_haitutor.mvclist.service.ITeacherService;
import exercise_haitutor.mvclist.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        do {
            System.out.println("\n========== Menu Quản Lý Giảng Viên ==========" +
                    "\n1. Thêm mới giáo viên \n" +
                    "2. Xóa giáo viên \n" +
                    "3. Xem danh sách giáo viên \n" +
                    "4. Tìm theo ID \n" +
                    "5. Tìm theo tên \n" +
                    "6. Sắp xếp theo tên \n" +
                    "7. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    while (true) {
                        try {
                            iTeacherService.addTeacher();
                            break;
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    iTeacherService.findID();
                    break;
                case 5:
                    iTeacherService.findName();
                    break;
                case 6:
                    iTeacherService.bubbleSortName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
