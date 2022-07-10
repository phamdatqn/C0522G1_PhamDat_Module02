package models;

public class Room extends Facility{
   public String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String name, int useArea, double rentalCosts, int numberPeople, String rentalType, String freeService) {
        super(name, useArea, rentalCosts, numberPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
