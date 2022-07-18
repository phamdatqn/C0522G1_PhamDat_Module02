package ss12_map.exerice.arraylisst_linkedlist.arraylist.controller;

import ss12_map.exerice.arraylisst_linkedlist.arraylist.service.impl.ProductService;

import java.util.Scanner;

public class MenuController  {
    public static void menuController() {
        ProductService productService = new ProductService();
        MenuSort menuSort = new MenuSort();


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n========== PHẦN MỀM QUẢN LÝ SẢN PHẨM ==========\n" +
                    "Mời chọn chức năng: \n\n" +
                    "1. Thêm mới sản phẩm.\n" +
                    "2. Sửa sản phẩm.\n" +
                    "3. Xóa sản phẩm.\n" +
                    "4. Hiển sản phẩm.\n" +
                    "5. Tìm sản phẩm theo tên.\n" +
                    "6. Sắp xếp sản phẩm.\n" +
                    "7. Thoát!");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    productService.add();
                    break;
                }
                case 2: {
                    productService.update();
                    break;
                }
                case 3: {
                    productService.remove();
                    break;
                }
                case 4: {
                    productService.display();
                    break;
                }
                case 5: {
                    productService.findName();
                    break;
                }
                case 6: {
                    menuSort.menuSort();
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
