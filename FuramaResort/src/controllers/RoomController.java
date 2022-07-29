package controllers;

import exception.InputEmailException;
import exception.InputNameException;
import services.IRoomService;
import services.impl.RoomService;
import utils.InputUtil;

public class RoomController {

    private IRoomService iRoomService = new RoomService();

    public void menuRoom() {
        do {
            System.out.println("\n========== Room Management ==========" +
                    "\n1. Add new Room\n" +
                    "2. Delete Room\n" +
                    "3. Edit Room\n" +
                    "4. Display Room\n" +
                    "5. Search ID Room\n" +
                    "6. Search name Room\n" +
                    "7. Back to facility.\n");
            int choose = InputUtil.getInt("Please enter your selection: ");
            switch (choose) {
                case 1:
                    try {
                        iRoomService.add();
                    } catch (exception.InputNameException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    iRoomService.remove();
                    break;
                case 3:
                    try {
                        iRoomService.edit();
                    } catch (InputNameException | InputEmailException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    iRoomService.displayAll();
                    break;
                case 5:
                    iRoomService.findID();
                    break;
                case 6:
                    iRoomService.findName();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
