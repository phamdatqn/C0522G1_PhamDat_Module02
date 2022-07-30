package models.model_facility;

public class House extends Facility {
    private String roomStandard;
    private int numberFloors;


    public House() {
    }

    public House(String idFacility, String nameFacility, double useArea,
                 double rentalCosts, int maxPeople, String typeRental, String roomStandard, int numberFloors) {
        super(idFacility, nameFacility, useArea, rentalCosts, maxPeople, typeRental);
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

    @Override
    public String toString() {
        return "\n************** HOUSE **************" +
                super.toString() +
                "\nTiêu chuẩn phòng: " + roomStandard +
                "\nSố tầng: " + numberFloors + " tầng";
    }

    @Override
    public String getInfo() {
        return String.format("%s$$%s$$%.2f$$%.2f$$%d$$%s$$%s$$%d", getIdFacility(), getNameFacility(), getUseArea(),
                getRentalCosts(), getMaxPeople(), getTypeRental(), roomStandard, numberFloors);
    }

}
