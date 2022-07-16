package exercise_haitutor.car.controller;

import exercise_haitutor.car.service.IXeOtoService;
import exercise_haitutor.car.service.impl.XeOtoService;

import java.util.Scanner;

public class XeOtoController {
    private Scanner scanner = new Scanner(System.in);
    private IXeOtoService iXeOtoService = new XeOtoService();

    public void menuXeOto() {
        do {
            System.out.println("\n======= QUẢN LÝ XE Ô TÔ =======\n" +
                    "1. Thêm mới xe Ôtô \n" +
                    "2. Xóa xe ôtô \n" +
                    "3. Xem danh sách xe ôtô \n" +
                    "4. Tìm theo biển kiểm soát \n" +
                    "5. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iXeOtoService.themXeOto();
                    break;
                case 2:
                    iXeOtoService.xoaXeOto();
                    break;
                case 3:
                    iXeOtoService.hienThiXeOto();
                    break;
                case 4:
                    iXeOtoService.timXeOto();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
