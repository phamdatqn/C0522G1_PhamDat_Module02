package exercise_haitutor.car.controller;

import exercise_haitutor.car.model.Xe;
import exercise_haitutor.car.service.impl.XeService;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        XeOtoController xeOtoController=new XeOtoController();
        XeMayController xeMayController = new XeMayController();
        XeTaiController xeTaiController =new XeTaiController();
        XeService xeService=new XeService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n========== PHẦN MỀM QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ==========\n" +
                    "Mời chọn chức năng: \n\n" +
                    "1. Quản Lý Xe Ôtô.\n" +
                    "2. Quản Lí Xe Tải.\n" +
                    "3. Quản Lý Xe Máy.\n" +
                    "4. Hiển Thị Phương Tiện.\n" +
                    "5. Xóa Phương Tiện.\n" +
                    "6. Tìm Kiếm Theo Biển Kiểm Soát.\n" +
                    "7. Thoát!");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    xeOtoController.menuXeOto();
                    break;
                }
                case 2: {
                    xeTaiController.menuXeTai();
                    break;
                }
                case 3: {
                    xeMayController.menuXeMay();
                    break;
                }
                case 4: {
                    xeService.hienThiXe();
                    break;
                }
                case 5: {
                      xeService.xoaPhuongTien();
                    break;
                }
                case 6: {
                      xeService.timPhuongTien();
                    break;
                }
                case 7: {
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    System.exit(1);
                }
            }
        } while (true);
    }
}
