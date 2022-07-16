package exercise_haitutor.car.service.impl;

import exercise_haitutor.car.model.XeOto;
import exercise_haitutor.car.service.IXeOtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeOtoService implements IXeOtoService {
    static Scanner sc = new Scanner(System.in);
    static List<XeOto> xeOtoList = new ArrayList<>();

    static {
        xeOtoList.add(new XeOto("76A1-00.638", "YAMAHA", "2011", "PHẠM ĐẠT", 6, "Sedan"));
        xeOtoList.add(new XeOto("76A1-77777", "HONDA", "2012", "PHẠM ĐẠT", 6, "Hatchback"));
        xeOtoList.add(new XeOto("76A1-88888", "SUZUKI", "2014", "PHẠM ĐẠT", 6, "Suv"));
        xeOtoList.add(new XeOto("76A1-99999", "YAMAHA", "2016", "PHẠM ĐẠT", 6, "Coupe"));

    }

    public static XeOto infoXeOto() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienkiemSoat = sc.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String hangSanXuat = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        String namSanXuat = sc.nextLine();

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();

        System.out.print("Nhập số chổ ngồi: ");
        int soChoNgoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập kiểu xe: ");
        String kieuXe = sc.nextLine();

        XeOto xeOto = new XeOto(bienkiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        return xeOto;
    }

    @Override
    public void themXeOto() {
        XeOto xeOto = infoXeOto();
        xeOtoList.add(xeOto);
        System.out.println("Thêm mới thành công! ");
    }

    @Override
    public void xoaXeOto() {
        System.out.println("Mời bạn nhập biển kiểm soát cần xóa:");
        String bienKiemSoat = sc.nextLine();

        boolean answer = false;
        for (int i = 0; i < xeOtoList.size(); i++) {
            if (xeOtoList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");

                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    xeOtoList.remove(i);
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
    public void hienThiXeOto() {
        System.out.println("\nDanh sách xe ôtô hiện có: ");
        for (int i = 0; i < xeOtoList.size(); i++) {
            System.out.println(xeOtoList.get(i));
        }
    }


    @Override
    public void timXeOto() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm:");
        String bienKiemSoat = sc.nextLine();

        boolean timKiem = false;
        for (int i = 0; i < xeOtoList.size(); i++) {
            if (bienKiemSoat.equals(xeOtoList.get(i).getBienKiemSoat())) {
                System.out.println("Tìm thấy thông tin của biển kiểm soát: " + bienKiemSoat);
                System.out.println(xeOtoList.get(i).toString());
                timKiem = true;
            }
        }

        if (!timKiem) {
            System.out.println("Không tìm thấy thông tin xe mang biển kiểm soát: " + bienKiemSoat);
        }
    }
}
