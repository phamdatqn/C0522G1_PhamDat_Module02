package models.model_facility;

public class Booking implements Comparable<Booking> {
    private String idBooking;
    private String startDay;
    private String endDay;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBooking, String startDay, String endDay,
                   String idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "\n*************** BOOKING ***************" +
                "\nMã booking: " + idBooking +
                "\nMã dịch vụ: " + typeService+
                "\nMã khách hàng: " + idCustomer +
                "\nNgày bắt đầu: " + startDay +
                "\nNgày kết thúc: " + endDay +
                "\nTên dịch vụ: " + nameService ;

    }

    public String getInfo() {
        return String.format("%s$$%s$$%s$$%s$$%s$$%s", idBooking, startDay, endDay, idCustomer,
                nameService, typeService);
    }

    @Override
    public int compareTo(Booking o) {
        if (o == null) {
            return -1;
        }
        return this.idBooking.compareTo(o.idBooking);
    }
}
