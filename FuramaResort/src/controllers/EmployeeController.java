package controllers;

import exception.InputEmailException;
import exception.InputNameException;
import services.IEmployeeService;
import services.impl.EmployeeService;
import utils.InputUtil;

public class EmployeeController {
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

            int choose = InputUtil.getInt("Please enter your selection:   ");
            switch (choose) {
                case 1:
                    try {
                        iEmployeeService.add();
                    } catch (exception.InputNameException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    iEmployeeService.remove();
                    break;
                case 3:
                    try {
                        iEmployeeService.edit();
                    } catch (InputNameException | InputEmailException e) {
                        e.printStackTrace();
                    }
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
