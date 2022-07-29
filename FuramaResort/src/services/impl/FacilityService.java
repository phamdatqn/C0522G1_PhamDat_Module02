package services.impl;

import exception.InputEmailException;
import exception.InputNameException;
import services.IFacilityService;
import utils.InputUtil;

import java.util.Scanner;

public class FacilityService implements IFacilityService {

    @Override
    public void add() {
        VillaService villaService = new VillaService();
        HouseService houseService = new HouseService();
       RoomService roomService =new RoomService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========== MENU ADD FACILITY ==========" +
                    "\n1. Add New Villa" +
                    "\n2. Add New House" +
                    "\n3. Add New Room" +
                    "\n4. Back to menu\n");
            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1: {
                    villaService.add();
                    break;
                }
                case 2: {
                    houseService.add();
                    break;
                }
                case 3: {
                    roomService.add();
                    break;
                }
                case 4: {
                    return;
                }
            }
        } while (true);
    }


    @Override
    public void remove() {

    }

    @Override
    public void edit() throws InputEmailException, InputNameException {

    }

    @Override
    public void findID() {

    }

    @Override
    public void findName() {

    }

    @Override
    public void displayAll() {
        HouseService houseService = new HouseService();
        RoomService roomService = new RoomService();
        VillaService villa = new VillaService();
        houseService.displayAll();
        roomService.displayAll();
        villa.displayAll();
    }
}
