package controllers.facility_controller;

import utils.InputUtil;

public class PromotionController {
    public void menuPromotion() {
        do {
            System.out.println("\n========== PROMOTION MANAGEMENT ==========" +
                    "\n1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n");

            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;


                case 4:
                    return;
            }
        } while (true);
    }
}
