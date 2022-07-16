package exercise_haitutor.car.model;

public class XeTai extends Xe {
    private String trongTai;

    public XeTai() {
    }

    public XeTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHo, String trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHo);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Trọng tải: "+trongTai
                +super.toString();
    }
}
