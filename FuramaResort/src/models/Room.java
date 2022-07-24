package models;

public class Room extends Facility{
   public String freeService;

    public Room() {
    }

    public Room(String nameFacility, int useArea, double rentalCosts, int maxPeople, String typeRental, String freeService) {
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
}
