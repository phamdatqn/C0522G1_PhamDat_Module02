package ss12_map.exerice.arraylisst_linkedlist.arraylist.controller;

import exercise_haitutor.car.service.IXeMayService;
import exercise_haitutor.car.service.impl.XeMayService;
import ss12_map.exerice.arraylisst_linkedlist.arraylist.model.Product;
import ss12_map.exerice.arraylisst_linkedlist.arraylist.service.IProduct;
import ss12_map.exerice.arraylisst_linkedlist.arraylist.service.impl.ProductService;

import java.util.Scanner;

public class MenuSort {
    private Scanner scanner = new Scanner(System.in);
    private IProduct product = new ProductService();

    public void menuSort() {
        do {
            System.out.println("\n======= Chọn Sắp xếp =======\n" +
                    "1. Sắp xếp giá tăng dần\n" +
                    "2. Sắp xếp giá giảm dần\n" +
                    "3. Quay về menu chính.\n Mời chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    product.sortIncrease();
                    break;
                case 2:
                    product.sortDecrease();
                    break;
                case 3:
                   return;
            }
        } while (true);
    }
}
