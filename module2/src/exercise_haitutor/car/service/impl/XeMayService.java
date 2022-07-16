package exercise_haitutor.car.service.impl;

import exercise_haitutor.car.model.XeMay;
import exercise_haitutor.car.service.IXeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    static Scanner sc = new Scanner(System.in);
    static List<XeMay> xeMayList = new ArrayList<>();

    static {
        xeMayList.add(new XeMay("76C1-00.638", "YAMAHA", "2011", "PHẠM ĐẠT", "115cc"));
        xeMayList.add(new XeMay("76C1-74.226", "HONDA", "2021", "PHẠM ĐẠT", "120cc"));
        xeMayList.add(new XeMay("76C1-09999", "SUZUKI", "2022", "PHẠM ĐẠT", "1000cc"));
    }

    public static XeMay infoXeMay() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienkiemSoat = sc.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String hangSanXuat = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        String namSanXuat = sc.nextLine();

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();

        System.out.print("Nhập Công Xuất: ");
        String congXuat = sc.nextLine();

        XeMay xeMay = new XeMay(bienkiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congXuat);
        return xeMay;
    }

    @Override
    public void themXeMay() {
        XeMay xeMay = infoXeMay();
        xeMayList.add(xeMay);
        System.out.println("Thêm mới thành công! ");
    }

    @Override
    public void xoaXeMay() {
        System.out.println("Mời bạn nhập biển kiểm soát cần xóa:");
        String bienKiemSoat = sc.nextLine();

        boolean answer = false;
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");

                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    xeMayList.remove(i);
                    System.out.println("đã xóa id " + bienKiemSoat + " thành công!");
                }
                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println("Không tìm thấy id: " + bienKiemSoat);
        }
    }

    @Override
    public void hienThiXeMay() {
        System.out.println("\nDanh sách xe máy hiện có: ");
        for (int i = 0; i < xeMayList.size(); i++) {
            System.out.println(xeMayList.get(i));
        }
    }


    @Override
    public void timXeMay() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm:");
        String bienKiemSoat = sc.nextLine();

        boolean timKiem = false;
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienKiemSoat.equals(xeMayList.get(i).getBienKiemSoat())) {
                System.out.println("Tìm thấy thông tin của biển kiểm soát: " + bienKiemSoat);
                System.out.println(xeMayList.get(i).toString());
                timKiem = true;
            }
        }

        if (!timKiem) {
            System.out.println("Không tìm thấy thông tin xe mang biển kiểm soát: " + bienKiemSoat);
        }
    }
}

