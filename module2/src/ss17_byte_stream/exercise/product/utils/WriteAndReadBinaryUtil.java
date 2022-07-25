package ss17_byte_stream.exercise.product.utils;

import ss17_byte_stream.exercise.product.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadBinaryUtil {
    public static void writeToFile(String path, List<Product> products) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataForm(String path) throws IOException {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }


}
