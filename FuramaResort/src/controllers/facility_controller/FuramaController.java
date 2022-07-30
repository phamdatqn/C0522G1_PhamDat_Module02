package controllers.facility_controller;

import controllers.person_controller.CustomerController;
import controllers.person_controller.EmployeeController;
import utils.InputUtil;

import java.util.Scanner;

public class FuramaController {
    public static void main() {
        EmployeeController employeeManagementController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========== PHẦN MỀM QUẢN LÝ FURAMA RESORT ==========" +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n6. Exit\n");

            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1: {
                    employeeManagementController.menuEmployee();
                    break;
                }
                case 2: {
                    customerController.menuCustomer();
                    break;
                }
                case 3: {
                    facilityController.menuFacility();
                    break;
                }
                case 4: {
                    bookingController.menuBooking();
                    break;
                }
                case 5: {
                    promotionController.menuPromotion();
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



