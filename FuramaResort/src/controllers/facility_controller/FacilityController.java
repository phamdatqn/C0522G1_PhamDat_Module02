package controllers.facility_controller;

import services.IFacilityService;
import services.impl.impl_facility.FacilityService;
import utils.InputUtil;

public class FacilityController {

    private IFacilityService iFacilityService = new FacilityService();
    FacilityManagementController facilityManagementController = new FacilityManagementController();


    public void menuFacility() {
        do {
            System.out.println("\n========== FACILITY ==========" +
                    "\n1. Facility Management\n" +
                    "2. Display list facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu.\n");
            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:
                    facilityManagementController.menuFacility();

                    break;
                case 2:
                    iFacilityService.displayAll();
                    break;
                case 3:
                    System.out.println("Chức năng đang bảo trì!");
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
