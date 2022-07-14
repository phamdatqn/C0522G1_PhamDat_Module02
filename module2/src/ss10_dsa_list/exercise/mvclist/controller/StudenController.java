package ss10_dsa_list.exercise.mvclist.controller;

import ss10_dsa_list.exercise.mvclist.service.IStudentService;
import ss10_dsa_list.exercise.mvclist.service.impl.StudentService;

import java.util.Scanner;

public class StudenController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("\n1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                   iStudentService.displayAllStudent();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
