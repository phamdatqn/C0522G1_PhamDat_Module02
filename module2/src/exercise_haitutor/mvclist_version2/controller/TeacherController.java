package exercise_haitutor.mvclist_version2.controller;

import exercise_haitutor.mvclist_version2.exception.DuplicateIDException;
import exercise_haitutor.mvclist_version2.service.ITeacherService;
import exercise_haitutor.mvclist_version2.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() throws IOException {
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
                            iTeacherService.add();
                            break;
                        } catch (DuplicateIDException | IOException e) {
                            System.out.println("ID Teacher này đã tồn tại, mời nhập lại!");
                        }
                    }
                    break;
                case 2:
                    iTeacherService.remove();
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
