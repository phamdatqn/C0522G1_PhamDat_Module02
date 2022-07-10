package models;

public class House extends Facility{
    private String roomStandard;
    private int numberFloors;

    public House(){}

    public House(String roomStandard, int numberFloors) {
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public House(String name, int useArea, double rentalCosts, int numberPeople, String rentalType, String roomStandard, int numberFloors) {
        super(name, useArea, rentalCosts, numberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
