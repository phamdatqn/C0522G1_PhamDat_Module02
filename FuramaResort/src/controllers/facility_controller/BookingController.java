package controllers.facility_controller;

import utils.InputUtil;

public class BookingController {
    public void menuBooking() {
        do {
            System.out.println("\n========== BOOKING MANAGEMENT ==========" +
                    "\n1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu.\n");

            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
