package exercise_haitutor.car.model;

public class XeMay extends Xe{
    private String congXuat;

    public XeMay() {
    }

    public XeMay(String congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHo, String congXuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHo);
        this.congXuat = congXuat;
    }

    public String getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(String congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "Công xuất: "+congXuat
                + super.toString();
    }
}
