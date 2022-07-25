package ss17_binary_serialization.exercise.product.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private String moreInformation;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, double price, String moreInformation) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.moreInformation = moreInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return moreInformation;
    }

    public void setColor(String color) {
        this.moreInformation = color;
    }

    @Override
    public String toString() {
        return "\n************* Thông tin sản phẩm *************" +
                "\nId: " + id +
                "\nTên sản phẩm: " + name +
                "\nHãng sản xuất: " + manufacturer +
                "\nGiá: " + price +" VNĐ"+
                "\nThông tin thêm: " + moreInformation ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
