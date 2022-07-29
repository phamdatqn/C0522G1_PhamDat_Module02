package controllers;

import exception.InputEmailException;
import exception.InputNameException;
import services.ICustomerService;
import services.impl.CustomerService;
import utils.InputUtil;

public class CustomerController {

    private ICustomerService iCustomerService = new CustomerService();

    public void menuCustomer() {
        do {
            System.out.println("\n========== Menu Quản Lý Khách Hàng ==========" +
                    "\n1. Add new customers\n" +
                    "2. Delete customers\n" +
                    "3. Edit customers\n" +
                    "4. Display customers\n" +
                    "5. Search ID customers\n" +
                    "6. Search name customers\n" +
                    "7. Return main menu.\n");

            int choose = InputUtil.getInt("Please enter your selection:  ");
            switch (choose) {
                case 1:
                    try {
                        iCustomerService.add();
                    } catch (exception.InputNameException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    iCustomerService.remove();
                    break;
                case 3:
                    try {
                        iCustomerService.edit();
                    } catch (InputNameException | InputEmailException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    iCustomerService.displayAll();
                    break;
                case 5:
                    iCustomerService.findID();
                    break;
                case 6:
                    iCustomerService.findName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
