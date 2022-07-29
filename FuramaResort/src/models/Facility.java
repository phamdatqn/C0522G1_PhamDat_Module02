package models;

public abstract class Facility {
    private String idFacility;
    private String nameFacility;
    private double useArea;
    private double rentalCosts;
    private int maxPeople;
    private String typeRental;

    public Facility() {
    }

    public Facility(String idFacility, String nameFacility, double useArea,
                    double rentalCosts, int maxPeople, String typeRental) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.typeRental = typeRental;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
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

    public void setUseArea(double useArea) {
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
        return "\nMã dịch vụ: "+idFacility+
                "\nTên dịch vụ: " + nameFacility +
                "\nDiện tích sử dụng : " + useArea + " mét vuông."+
                "\nPhí thuê: " + rentalCosts + " VNĐ"+
                "\nSố lượng tối đa: " + maxPeople + " người"+
                "\nLoại thuê: " + typeRental;
    }

    public abstract String getInfo();

}
