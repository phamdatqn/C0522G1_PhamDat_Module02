package controllers.facility_controller;

import services.IHouseService;
import services.impl.impl_facility.HouseService;
import utils.InputUtil;

public class HouseController {
    private IHouseService iHouseService = new HouseService();

    public void menuHouse() {
        do {
            System.out.println("\n========== House Management ==========" +
                    "\n1. Add new House\n" +
                    "2. Delete House\n" +
                    "3. Edit House\n" +
                    "4. Display House\n" +
                    "5. Search ID House\n" +
                    "6. Search name House\n" +
                    "7. Back to facility.\n");

            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:

                        iHouseService.add();
                    break;
                case 2:
                    iHouseService.remove();
                    break;
                case 3:
                        iHouseService.edit();
                    break;
                case 4:
                    iHouseService.displayAll();
                    break;
                case 5:
                    iHouseService.findID();
                    break;
                case 6:
                    iHouseService.findName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
