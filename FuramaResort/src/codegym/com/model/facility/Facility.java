package codegym.com.model.facility;

public abstract class Facility {
        private String maDichVu;

        private String tenDichVu;
        private double chiPhiThue;
        private int soLuongToiDa;
        private String kieuThue;

    public Facility() {
    }

    public Facility(String maDichVu, String tenDichVu, double chiPhiThue, int soLuongToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.chiPhiThue = chiPhiThue;
        this.soLuongToiDa = soLuongToiDa;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return  maDichVu + " - " +
                 tenDichVu + " - " +
                 chiPhiThue + " - "+
                soLuongToiDa + " - "
                + kieuThue
                ;
    }
}
