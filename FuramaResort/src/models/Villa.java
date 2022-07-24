package models;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String nameFacility, int useArea, double rentalCosts, int maxPeople, String typeRental, String roomStandard, double swimmingPoolArea, int numberFloors) {
        super(nameFacility, useArea, rentalCosts, maxPeople, typeRental);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "\n************ VILLA ************" +
                "\nTiêu chuẩn phòng: " + roomStandard +
                "\nDiện tích hồ bơi : " + swimmingPoolArea +
                "\nSố tầng: " + numberFloors + super.toString();
    }
}
