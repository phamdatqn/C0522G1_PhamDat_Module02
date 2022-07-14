package ss10_dsa_list.exercise.arraymylist.controller;

import java.util.Scanner;

public class MainController {
    StudentListController studentListService = new StudentListController();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            System.out.println("======= PHẦN MỀM QUẢN LÝ HỌC SINH =======");
            System.out.println("1. Thêm học sinh mới vào vị trí cuối");
            System.out.println("2. Thêm học sinh mới vào vị trí bất kỳ :");
            System.out.println("3. Hiển thị danh sách học sinh");
            System.out.println("4. Chỉnh sửa");
            System.out.println("5. Xóa");
            System.out.println("6. Thoát");
            System.out.print("Mời chọn: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 6) {
                System.out.println("Lựa chọn không hợp lệ, mời chọn lại");
                continue;
            }
            switch (choose) {
                case 1:
                    studentListService.addStudent();
                    break;
                case 2:
                    int index = 0;
                    studentListService.addStudent(index);
                    break;
                case 3:
                    studentListService.display();
                    break;
                case 4:
                    System.out.println("chức năng đang update");
                    break;
                case 5:
                    index = 0;
                    studentListService.deleteStudent(index);
                    break;
                case 6:
                    System.out.println("Bạn đã thoát khỏi chương trình");
                    System.exit(0);

            }
        } while (true);
    }
}
