package exercise_haitutor.car.service.impl;

import exercise_haitutor.car.model.XeOto;
import exercise_haitutor.car.service.IXeOtoService;
import exercise_haitutor.mvclist.exception.DuplicateIDException;

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
        System.out.println("Nhập biển kiểm soát: ");
        String bienkiemSoat = sc.nextLine();

        System.out.println("Nhập tên hãng sản xuất: ");
        String hangSanXuat = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        String namSanXuat = sc.nextLine();

        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();

        System.out.println("Nhập số chổ ngồi: ");
        int soChoNgoi = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập kiểu xe: ");
        String kieuXe = sc.nextLine();

        return new XeOto(bienkiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
    }

    @Override
    public void themXeOto() {
        XeOto xeOto;
        while (true) {
            try {
                xeOto = infoXeOto();
                for (XeOto oto : xeOtoList) {
                    if (xeOto.getBienKiemSoat().equals(oto.getBienKiemSoat())) {
                        throw new DuplicateIDException("Trùng biển số xe");
                    }
                }
                xeOtoList.add(xeOto);
                System.out.println("Thêm mới thành công! ");
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

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
                        "\n2. Không");

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
        for (XeOto xeOto : xeOtoList) {
            System.out.println(xeOto);
        }
    }


    @Override
    public void timXeOto() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm:");
        String bienKiemSoat = sc.nextLine();

        boolean timKiem = false;
        for (XeOto xeOto : xeOtoList) {
            if (bienKiemSoat.equals(xeOto.getBienKiemSoat())) {
                System.out.println("Tìm thấy thông tin của biển kiểm soát: " + bienKiemSoat);
                System.out.println(xeOto);
                timKiem = true;
            }
        }

        if (!timKiem) {
            System.out.println("Không tìm thấy thông tin xe mang biển kiểm soát: " + bienKiemSoat);
        }
    }
}
