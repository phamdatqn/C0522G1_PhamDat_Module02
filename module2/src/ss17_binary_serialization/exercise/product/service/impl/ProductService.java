package ss17_binary_serialization.exercise.product.service.impl;

import ss17_binary_serialization.exercise.product.exception.DuplicateIDException;
import ss17_binary_serialization.exercise.product.model.Product;
import ss17_binary_serialization.exercise.product.service.IProduct;
import ss17_binary_serialization.exercise.product.utils.InputUtil;
import ss17_binary_serialization.exercise.product.utils.WriteAndReadBinaryUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    static String PATH = "module2/src/ss17_byte_stream/exercise/binary_file/data/data.csv";
    static Scanner scanner = new Scanner(System.in);


//    public static void data() throws IOException {
//
//        List<Product> products = new ArrayList<>();
//        products.add(new Product(2, "Bánh Tráng", "Vina Tây Ninh", 12000, "hạn dùng 6 tháng"));
//        products.add(new Product(3, "Nước Coca-Cola", "Vina Food", 7000, "Có ga"));
//        products.add(new Product(4, "Bánh Chocopie", "Gia vị Việt", 15000, "hạn dùng 8 tháng"));
//        products.add(new Product(5, "Bánh Chocolate", "Vina Tây Food", 17000, "hạn dùng 7 tháng"));
//        products.add(new Product(6, "Kẹo bạc hà hạt nhân", "Vina Food", 20000, "hạn dùng 12 tháng"));
//        WriteAndReadBinary.writeToFile(PATH, products);
//        List<Product> products1 = WriteAndReadBinary.readDataForm(PATH);
//        for (Product product : products1) {
//            System.out.println(product);
//        }
//    }

    public static Product infoProduct(int id) {

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        double price = 0;
        try {
            System.out.println("Nhập giá: ");
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Không được nhập chữ!!!");
        }


        System.out.println("Nhập thông tin thêm: ");
        String moreInformation = scanner.nextLine();

        return new Product(id, name, manufacturer, price, moreInformation);
    }

    @Override
    public void add() throws IOException {
        List<Product> productList = WriteAndReadBinaryUtil.readDataForm(PATH);


        Product product;
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm: ");
                int id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < productList.size(); i++) {
                    if (id == productList.get(i).getId()) {
                        throw new DuplicateIDException("Mã sản phẩm đã tồn tại");
                    }
                }
                product = infoProduct(id);
                productList.add(product);
                WriteAndReadBinaryUtil.writeToFile(PATH, productList);
                System.out.println("Đã thêm sản phẩm mới thành công!.");
                break;
            } catch (DuplicateIDException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void display() throws IOException {
        List<Product> products = WriteAndReadBinaryUtil.readDataForm(PATH);
        for (Product item : products) {
            System.out.println(item);
        }
    }

    @Override
    public Product findId() throws IOException {
        List<Product> productList = WriteAndReadBinaryUtil.readDataForm(PATH);

        int findId = InputUtil.getInt("Nhập mã sản phẩm cần tìm: ");
        for (Product item : productList) {
            if (findId == item.getId()) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void remove() throws IOException {
        List<Product> productList = WriteAndReadBinaryUtil.readDataForm(PATH);

        int idRemove = InputUtil.getInt("Mời bạn nhập id cần xóa:");
        boolean answer = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idRemove) {
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(i);

                    WriteAndReadBinaryUtil.writeToFile(PATH, productList);
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
}
