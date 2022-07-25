package models;

public class Contract {
    private String idContract;
    private String idBooking;
    private double moneyDeposit;
    private double payments;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double moneyDeposit,
                    double payments, String idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.moneyDeposit = moneyDeposit;
        this.payments = payments;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(double moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "**************** Hợp Đồng ****************" +
                "\nMã hợp đồnh: " + idContract +
                "\nMã booking" + idBooking +
                "\nSố tiền cọc: " + moneyDeposit +
                "\nTổng tiền phải thanh toán: " + payments +
                "\nMã khách hàng: " + idCustomer ;
    }
}
