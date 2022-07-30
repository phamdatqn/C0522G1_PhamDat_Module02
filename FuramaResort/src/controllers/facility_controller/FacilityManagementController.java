package controllers.facility_controller;

import utils.InputUtil;

public class FacilityManagementController {

    private final HouseController houseController = new HouseController();
    private final RoomController roomController = new RoomController();
    private final VillaController villaController = new VillaController();


    public void menuFacility() {
        do {
            System.out.println("\n========== FACILITY MANAGEMENT ==========" +
                    "\n1. House Management\n" +
                    "2. Room Management\n" +
                    "3. Villa Management\n" +
                    "4. Back to facility.\n");

            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:
                    houseController.menuHouse();
                    break;
                case 2:
                    roomController.menuRoom();
                    break;
                case 3:
                    villaController.menuVilla();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
