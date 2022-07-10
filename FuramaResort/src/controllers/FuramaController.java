package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;
        do {
            System.out.println(displayMainMenu());
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(employeeManagement());
                    break;
                case 2:
                    System.out.println(customerManagement());
                    break;
                case 3:
                    System.out.println(facilityManagement());
                    break;
                case 4:
                    System.out.println(bookingManagement());
                    break;
                case 5:
                    System.out.println(promotionManagement());
                    break;
                case 6:
                    System.out.println("Đã thoát khỏi chương trình!");
                    break;
                default:
                    System.out.println("Nhập sai mời chọn lại:");
            }
        } while (input != 6);
    }

    public static String employeeManagement() {
        return "Employee Management menu:" +
                "\n1. Display list employees" +
                "\n2. Add new employee" +
                "\n3. Edit employee" +
                "\n4. Return main menu\n";
    }

    public static String customerManagement() {
        return "Customer Management menu:" +
                "\n1. Display list customers" +
                "\n2. Add new customer" +
                "\n3. Edit customer" +
                "\n4. Return main menu\n";
    }

    public static String facilityManagement() {
        return "Facility Management menu:" +
                "\n1. Display list facility" +
                "\n2. Add new facility" +
                "\n3. Display list facility maintenance" +
                "\n4. Return main menu\n";
    }

    public static String bookingManagement() {
        return "Booking Management menu:" +
                "\n1. Add new booking" +
                "\n2. Display list booking" +
                "\n3. Create new constracts" +
                "\n4. Display list contracts" +
                "\n5. Edit contracts" +
                "\n6. Return main menu\n";
    }

    public static String promotionManagement() {
        return "Promotion Management menu:" +
                "\n1. Display list customers use service" +
                "\n2. Display list customers get voucher" +
                "\n3. Return main menu\n";
    }

    public static String displayMainMenu() {
        return "Main menu: \n1. Employee Management" +
                "\n2. Customer Management" +
                "\n3. Facility Management" +
                "\n4. Booking Management" +
                "\n5. Promotion Management" +
                "\n6. Exit\nMời choice:";
    }

}
