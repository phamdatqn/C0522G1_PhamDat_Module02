package models;

import java.util.Date;

public class Customer extends Person {
    private String iDCustomer;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, Date dateOfBirth, boolean sex, String identityCardNumber, int number, String email, String iDCustomer, String customerType, String address) {
        super(name, dateOfBirth, sex, identityCardNumber, number, email);
        this.iDCustomer = iDCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public String getiDCustomer() {
        return iDCustomer;
    }

    public void setiDCustomer(String iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
