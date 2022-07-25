package controllers;

import exception.DuplicateIDException;
import services.IEmployeeService;
import services.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    private Scanner scanner = new Scanner(System.in);
    private IEmployeeService iEmployeeService = new EmployeeService();

    public void menuEmployee() {
        do {
            System.out.println("\n========== Menu Quản Lý Nhân Viên ==========" +
                    "\n1. Add new employee\n" +
                    "2. Delete employee\n" +
                    "3. Edit employee\n" +
                    "4. Display employee\n" +
                    "5. Search ID employee\n" +
                    "6. Search name employee\n" +
                    "7. Return main menu.\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    while (true) {
                        try {
                            iEmployeeService.add();
                            break;
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    break;
                case 2:
                    iEmployeeService.remove();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    iEmployeeService.displayAll();
                    break;
                case 5:
                    iEmployeeService.findID();
                    break;
                case 6:
                    iEmployeeService.findName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
