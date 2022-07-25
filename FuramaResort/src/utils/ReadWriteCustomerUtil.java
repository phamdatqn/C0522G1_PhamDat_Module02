package utils;

import models.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCustomerUtil extends IOFileUtil {
    public static List<Customer> readCustomer(String path) {
        List<String> data = readFile(path);
        List<Customer> customersData = new ArrayList<>();
        String[] arrProperty;
        for (String item : data) {
            arrProperty = item.split(",");
            customersData.add(new Customer(arrProperty[0], arrProperty[1], arrProperty[2], arrProperty[3]
                    , arrProperty[4], arrProperty[5], arrProperty[6], arrProperty[7], arrProperty[8]));
        }
        return customersData;
    }

    public static void writeCustomer(String path, List<Customer> customers) {
        StringBuilder data = new StringBuilder();
        data.append("Họ và tên, Ngày sinh, Giới tính, CMND,Số điện thoại, Email, Địa chỉ, Mã khách hàng, Loại khách hàng\n");
        for (Customer customer : customers) {
            data.append(customer.getInfo()).append("\n");
        }

        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
