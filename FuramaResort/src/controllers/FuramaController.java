package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main() {
        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========== PHẦN MỀM QUẢN LÝ FURAMA RESORT ==========" +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n6. Exit\n");

            System.out.print("Please enter your selection: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    employeeManagementController.menuEmployee();
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {
                    break;
                }

                case 6: {
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    System.exit(1);
                }
            }
        } while (true);
    }
}



