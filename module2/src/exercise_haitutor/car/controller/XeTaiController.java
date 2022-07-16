package exercise_haitutor.car.controller;

import exercise_haitutor.car.service.IXeTaiService;
import exercise_haitutor.car.service.impl.XeTaiService;

import java.util.Scanner;

public class XeTaiController {
    private Scanner scanner = new Scanner(System.in);
    private IXeTaiService iXeTaiService = new XeTaiService();

    public void menuXeTai() {
        do {
            System.out.println("\n======= QUẢN LÝ XE TẢI =======\n" +
                    "1. Thêm mới xe tải \n" +
                    "2. Xóa xe tải \n" +
                    "3. Xem danh sách xe tải \n" +
                    "4. Tìm theo biển kiểm soát \n" +
                    "5. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iXeTaiService.themXeTai();
                    break;
                case 2:
                    iXeTaiService.xoaXeTai();
                    break;
                case 3:
                    iXeTaiService.hienThiXeTai();
                    break;
                case 4:
                    iXeTaiService.timXeTai();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
