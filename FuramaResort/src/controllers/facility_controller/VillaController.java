package controllers.facility_controller;

import services.IVillaService;
import services.impl.impl_facility.VillaService;
import utils.InputUtil;

public class VillaController {

    private IVillaService iVillaService = new VillaService();

    public void menuVilla() {
        do {
            System.out.println("\n========== Villa Management ==========" +
                    "\n1. Add new Villa\n" +
                    "2. Delete Villa\n" +
                    "3. Edit Villa\n" +
                    "4. Display Villa\n" +
                    "5. Search ID Villa\n" +
                    "6. Search name Villa\n" +
                    "7. Back to facility.\n");

            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:
                        iVillaService.add();
                    break;
                case 2:
                    iVillaService.remove();
                    break;
                case 3:
                        iVillaService.edit();
                    break;
                case 4:
                    iVillaService.displayAll();
                    break;
                case 5:
                    iVillaService.findID();
                    break;
                case 6:
                    iVillaService.findName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}

