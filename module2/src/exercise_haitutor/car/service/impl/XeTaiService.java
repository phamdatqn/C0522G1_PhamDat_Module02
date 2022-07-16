package exercise_haitutor.car.service.impl;

import exercise_haitutor.car.model.XeTai;
import exercise_haitutor.car.service.IXeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    static Scanner sc = new Scanner(System.in);
    static List<XeTai> xeTaiList = new ArrayList<>();

    static {
        xeTaiList.add(new XeTai("76C1-11118", "YAMAHA", "2011", "PHẠM ĐẠT", "1 tấn"));
        xeTaiList.add(new XeTai("76C1-11112", "YAMAHA", "2011", "PHẠM ĐẠT", "1.9 tấn"));
        xeTaiList.add(new XeTai("76C1-11113", "YAMAHA", "2011", "PHẠM ĐẠT", "2 tấn"));
        xeTaiList.add(new XeTai("76C1-11114", "YAMAHA", "2011", "PHẠM ĐẠT", "1.5 tấn"));
        xeTaiList.add(new XeTai("76C1-11115", "YAMAHA", "2011", "PHẠM ĐẠT", "3.5 tấn"));


    }

    public static XeTai infoXeTai() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienkiemSoat = sc.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String hangSanXuat = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        String namSanXuat = sc.nextLine();

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();

        System.out.print("Nhập trọng tải: ");
        String trongTai = sc.nextLine();

        XeTai xeTai = new XeTai(bienkiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        return xeTai;
    }


    @Override
    public void themXeTai() {
        XeTai xeTai = infoXeTai();
        xeTaiList.add(xeTai);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void xoaXeTai() {
        System.out.println("Mời bạn nhập biển kiểm soát cần xóa:");
        String bienKiemSoat = sc.nextLine();

        boolean answer = false;
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");

                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    xeTaiList.remove(i);
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
    public void hienThiXeTai() {
        System.out.println("\nDanh sách tất cả xe tải hiện có: ");
        for (int i = 0; i < xeTaiList.size(); i++) {
            System.out.println(xeTaiList.get(i));
        }

    }

    @Override
    public void timXeTai() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm:");
        String bienKiemSoat = sc.nextLine();

        boolean timKiem = false;
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())) {
                System.out.println("Tìm thấy thông tin của biển kiểm soát: " + bienKiemSoat);
                System.out.println(xeTaiList.get(i).toString());
                timKiem = true;
            }
        }

        if (!timKiem) {
            System.out.println("Không tìm thấy thông tin xe mang biển kiểm soát: " + bienKiemSoat);
        }
    }

}

