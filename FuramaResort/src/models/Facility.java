package models;

public class Facility {
    private String name;
    private int useArea;
    private double rentalCosts;
    private int numberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String name, int useArea, double rentalCosts, int numberPeople, String rentalType) {
        this.name = name;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.numberPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public int getUseArea() {
        return useArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

}
