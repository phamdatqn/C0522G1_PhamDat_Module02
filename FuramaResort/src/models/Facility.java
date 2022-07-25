package models;

public abstract class Facility {
    private String nameFacility;
    private double useArea;
    private double rentalCosts;
    private int maxPeople;
    private String typeRental;

    public Facility() {
    }

    public Facility(String nameFacility, double useArea, double rentalCosts, int maxPeople, String typeRental) {
        this.nameFacility = nameFacility;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.typeRental = typeRental;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "\n************ FACILITY ************" +
                "\nLoại cơ sở: " + nameFacility +
                "\nDiện tích sử dụng: " + useArea +
                "\nPhí thuê: " + rentalCosts +
                "\nSố lượng người: " + maxPeople +
                "\nLoại thuê:" + typeRental;
    }

    public abstract String getInfo();

}
