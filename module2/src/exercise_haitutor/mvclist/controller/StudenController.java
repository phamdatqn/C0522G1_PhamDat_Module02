package exercise_haitutor.mvclist.controller;

import exercise_haitutor.mvclist.exception.DuplicateIDException;
import exercise_haitutor.mvclist.service.IStudentService;
import exercise_haitutor.mvclist.service.impl.StudentService;

import java.util.Scanner;

public class StudenController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("\n========== Menu Quản Lý Học Sinh ==========" +
                    "\n1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Tìm học sinh theo ID \n" +
                    "5. Tìm học sinh theo tên \n" +
                    "6. Sắp xếp theo tên \n" +
                    "7. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    while (true) {
                        try {
                            iStudentService.addStudent();
                            break;
                        } catch (DuplicateIDException e) {
                            System.out.println("ID học sinh này đã tồn tại, mời nhập lại!");
                        }

                    }

                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.findID();
                    break;
                case 5:
                    iStudentService.findName();
                    break;
                case 6:
                    iStudentService.bubbleSortName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
