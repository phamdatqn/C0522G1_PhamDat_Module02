package exercise_haitutor.car.service.impl;

import exercise_haitutor.car.model.Xe;
import exercise_haitutor.car.service.IXeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeService implements IXeService {
    static List<Xe> xeList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void hienThiXe() {
        for (Xe xe : xeList) {
            System.out.println(xe);
        }
    }

    static {
        xeList.addAll(XeMayService.xeMayList);
        xeList.addAll(XeTaiService.xeTaiList);
        xeList.addAll(XeOtoService.xeOtoList);

    }

    @Override
    public void xoaPhuongTien() {
        System.out.println("Mời bạn nhập biển kiểm soát cần xóa:");
        String bienKiemSoat = sc.nextLine();

        boolean answer = false;
        for (int i = 0; i < xeList.size(); i++) {
            if (bienKiemSoat.equals(xeList.get(i).getBienKiemSoat())) {
                System.out.println("Đã tìm thấy biển kiểm soát : " + bienKiemSoat);
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");

                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    xeList.remove(i);
                    System.out.println("đã xóa id " + bienKiemSoat + " thành công!");
                }
                answer = true;
                break;
            }

        }
        if (!answer) {
            System.out.println("Không tìm thấy biển kiểm soát: " + bienKiemSoat);
        }

    }


    @Override
    public void timPhuongTien() {
        System.out.println("Nhập biển kiểm soát cần tìm: ");
        String find = sc.nextLine();

        boolean result = false;
        for (Xe xe : xeList) {
            if (find.equals(xe.getBienKiemSoat())) {
                System.out.println("Tìm thấy thông tin xe mang biển kiểm soát: " + find);
                System.out.println(xe);
                result = true;
            }
        }
        if (!result) {
            System.out.println("Không tìm thấy thông tin xe có biển kiểm soát: " + find);
        }
    }

}