package exercise_haitutor.car.controller;

import exercise_haitutor.car.model.XeMay;
import exercise_haitutor.car.service.IXeMayService;
import exercise_haitutor.car.service.impl.XeMayService;

import java.util.Scanner;

public class XeMayController {
    private Scanner scanner = new Scanner(System.in);
    private IXeMayService iXeMayService = new XeMayService();

    public void menuXeMay() {
        do {
            System.out.println("\n======= QUẢN LÝ XE MÁY =======\n" +
                    "1. Thêm mới xe máy \n" +
                    "2. Xóa xe máy \n" +
                    "3. Xem danh sách xe máy \n" +
                    "4. Tìm theo biển kiểm soát \n" +
                    "5. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iXeMayService.themXeMay();
                    break;
                case 2:
                    iXeMayService.xoaXeMay();
                    break;
                case 3:
                       iXeMayService.hienThiXeMay();
                    break;
                case 4:
                       iXeMayService.timXeMay();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
