package models;

import java.util.Date;

public class Customer extends Person {
    private String idCustomer;
    private String customerType;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard,
                    String numberPhone, String email, String address, String idCustomer, String customerType) {
        super(name, birthday, gender, idCard, numberPhone, email, address);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "\n**************** CUSTOMER ****************" +
                "\nMã khách hàng: " + idCustomer +
                "\nLoại khách hàng: " + customerType + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,",getName(), getBirthday(), getGender(), getIdCard(),
                getNumberPhone(), getEmail(), getAddress(), idCustomer, customerType);
    }
}
