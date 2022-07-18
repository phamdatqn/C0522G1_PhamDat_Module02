package ss12_map.exerice.arraylisst_linkedlist.arraylist.service.impl;

import ss12_map.exerice.arraylisst_linkedlist.arraylist.model.Product;
import ss12_map.exerice.arraylisst_linkedlist.arraylist.service.IProduct;

import java.util.*;

public class ProductService implements IProduct {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product("Bánh Tráng", 1, 10000));
        productArrayList.add(new Product("Phồng Tôm", 2, 5000));
        productArrayList.add(new Product("Nước Coca Cola", 3, 15000));

    }

    public static Product infoProduct() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());

        return new Product(name, id, price);
    }

    @Override
    public void add() {
        Product product = infoProduct();
        productArrayList.add(product);
        System.out.println("Thêm mới thành công! ");
    }

    @Override
    public void remove() {
        System.out.println("Nhập vào id cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());

        boolean answer = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == idRemove) {
                System.out.println("Bạn chắc chắn muốn xóa? " +
                        "\n1. Có" +
                        "\n2. Không");

                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    productArrayList.remove(i);
                    System.out.println("đã xóa id " + idRemove + " thành công!");
                }
                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println("Không tìm thấy id: " + idRemove);
        }

    }

    @Override
    public void update() {
        System.out.println("Nhập vào id cần sửa: ");
        int idUpdate = Integer.parseInt(sc.nextLine());

        Product productUpdate = infoProduct();
        int i;
        for (i = 0; i < productArrayList.size(); i++) {
            if (idUpdate == productArrayList.get(i).getId()) {
                productArrayList.set(i, productUpdate);
                System.out.println("Update thành công sản phẩm: \n" + productArrayList.get(i));
            }
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i).toString());
        }
    }

    public void findName() {
        System.out.println("Nhập tên cần tìm kiếm: ");
        String name = sc.nextLine();

        boolean result = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())) {
                System.out.println("Tìm thấy thông tin sản phẩm: " + name);
                System.out.println(productArrayList.get(i).toString());
                result = true;
            }
        }
        if (!result) {
            System.out.println("Không tìm thấy thông tin sản phẩm: " + name);
        }
    }

    @Override
    public void sortIncrease() {
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void sortDecrease() {
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

    }

}


