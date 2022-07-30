package models.model_facility;

public class Villa extends Facility {
    private String roomStandard;
    private int numberFloors;
    private double swimmingPoolArea;


    public Villa() {
    }


    public Villa(String idFacility, String nameFacility, double useArea, double rentalCosts,
                 int maxPeople, String typeRental, String roomStandard, int numberFloors, double swimmingPoolArea) {
        super(idFacility, nameFacility, useArea, rentalCosts, maxPeople, typeRental);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
        this.swimmingPoolArea = swimmingPoolArea;
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
                super.toString() +
                "\nTiêu chuẩn phòng: " + roomStandard +
                "\nSố tầng: " + numberFloors + " tầng." +
                "\nDiện tích hồ bơi : " + swimmingPoolArea + " mét vuông.";
    }

    @Override
    public String getInfo() {
        return String.format("%s$$%s$$%.2f$$%.2f$$%d$$%s$$%s$$%d$$%.2f", getIdFacility(), getNameFacility(), getUseArea(), getRentalCosts(), getMaxPeople(),
                getTypeRental(), roomStandard, getNumberFloors(), getSwimmingPoolArea());
    }
}
