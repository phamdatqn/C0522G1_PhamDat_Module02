package ss17_byte_stream.exercise.product.controller;

import ss17_byte_stream.exercise.product.model.Product;
import ss17_byte_stream.exercise.product.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    public static void main() throws IOException {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        do {
            System.out.println("\n========== PHẦN MỀM QUẢN LÝ SẢN PHẨM ==========\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Hiển thị tất cả sản phẩm\n" +
                    "3. Tìm theo ID\n" +
                    "4. Xóa sản phẩm\n" +
                    "5. Thoát chương trình");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    productService.add();
                    break;
                }
                case 2: {
                    productService.display();
                    break;
                }
                case 3: {
                    Product product=productService.findId();
                    if (product!=null){
                        System.out.println("Thông tin sản phẩm cần tìm là: "+product);
                    }else {
                        System.out.println("Không tìm thấy thông tin");
                    }
                    break;
                }
                case 4: {
                    productService.remove();
                    break;
                }
                case 5: {
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    System.exit(1);
                }
            }
        } while (true);
    }
}

