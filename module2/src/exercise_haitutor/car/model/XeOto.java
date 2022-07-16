package exercise_haitutor.car.model;

public class XeOto extends Xe {
    private int soChoNgoi;
    private String kieuXe;

    public XeOto() {
    }

    public XeOto(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHo, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHo);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Kiểu xe: " + kieuXe +
                ", Số lượng ghế: " + soChoNgoi
                +super.toString();
    }
}
