package ss10_dsa_list.exercise.arraylist.controller;

import ss10_dsa_list.exercise.arraylist.service.impl.MyArrayListService;
import ss10_dsa_list.exercise.arraylist.service.impl.StudentListService;

import java.util.Scanner;

public class MainController {
 StudentListService studentListService =new StudentListService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== Menu ========");
            System.out.println("1. them moi");
            System.out.println("2. them moi tại vị trí :");
            System.out.println("3. hien thi danh sach");
            System.out.println("4. chinh sua");
            System.out.println("5. delete");
            System.out.println("6. thoat");
            System.out.print("nhap su lua chon cua ban: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("lua chon khong hop le, xin nhap lai");
                continue;
            }
            switch (choose) {
                case 1:
                    studentListService.addStudent();
                    break;
                case 2:
                        int index =0;
                        studentListService.addStudent(index);
                        break;
                case 3:
                    studentListService.display();
                    break;
                case 4:
                    System.out.println("chức năng đang update");
                    break;
                case 5:
                     index=0;
                    studentListService.deleteStudent(index);
                    break;
                case 6:
                   System.exit(0);

            }
        } while (true);
    }
}
