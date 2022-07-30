package models.model_facility;

public class Room extends Facility {
    public String freeService;

    public Room() {
    }

    public Room(String idFacility, String nameFacility, double useArea,
                double rentalCosts, int maxPeople, String typeRental, String freeService) {
        super(idFacility, nameFacility, useArea, rentalCosts, maxPeople, typeRental);
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
                super.toString() +
                "\nDịch vụ miễn phí đi kèm: " + freeService;
    }

    @Override
    public String getInfo() {
        return String.format("%s$$%s$$%.2f$$%.2f$$%d$$%s$$%s", getIdFacility(), getNameFacility(), getUseArea(), getRentalCosts(), getMaxPeople(), getTypeRental(), freeService);
    }
}
