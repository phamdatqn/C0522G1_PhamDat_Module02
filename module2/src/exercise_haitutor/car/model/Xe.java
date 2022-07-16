package exercise_haitutor.car.model;

public abstract class Xe {
    private String bienKiemSoat;
    private String hangSanXuat;
    private String namSanXuat;
    private String chuSoHo;

    public Xe() {
    }

    public Xe(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHo) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHo = chuSoHo;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHo() {
        return chuSoHo;
    }

    public void setChuSoHo(String chuSoHo) {
        this.chuSoHo = chuSoHo;
    }

    @Override
    public String toString() {
        return ", Biển kiểm soát: "+bienKiemSoat+
                ", Hãng sản xuất: "+hangSanXuat+
                ", Năm sản xuất: "+namSanXuat+
                ", Chủ sở hữu: "+chuSoHo;
    }
}
