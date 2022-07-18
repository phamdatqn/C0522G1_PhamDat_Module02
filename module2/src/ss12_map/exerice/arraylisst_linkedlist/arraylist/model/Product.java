package ss12_map.exerice.arraylisst_linkedlist.arraylist.model;


public class Product implements Comparable<Product> {
    private String name;
    private int id;
    private double price;

    public Product(Product product) {
    }

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Tên sản phẩm: " + name +
                ", Giá: " + price + " VNĐ";
    }

    @Override
    public int compareTo(Product product) {
        if (this.getPrice() > product.getPrice()) {
            return 1;
        } else if (this.getPrice() == product.getPrice()) {
            return 0;
        } else {

            return -1;
        }
    }
}
