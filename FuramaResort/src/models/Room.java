package models;

public class Room extends Facility{
   public String freeService;

    public Room() {
    }

    public Room(String nameFacility, double useArea, double rentalCosts, int maxPeople, String typeRental, String freeService) {
        super(nameFacility, useArea, rentalCosts, maxPeople, typeRental);
        this.freeService = freeService;
    }

    public String getFreeService() {

        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "\n*************** ROOM ***************" +
                "\nDịch vụ miễn phí đi kèm: " + freeService
                + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%.2f,%.2f,%d,%s,%s",getNameFacility(), getUseArea(), getRentalCosts(), getMaxPeople(),getTypeRental(), freeService);
    }
}
