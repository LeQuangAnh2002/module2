package codegym.com.model.facility;

import codegym.com.model.facility.Facility;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private Double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, Double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String maDichVu, String tenDichVu, double chiPhiThue, int soLuongToiDa, String kieuThue, String tieuChuanPhong, Double dienTichHoBoi, int soTang) {
        super(maDichVu, tenDichVu, chiPhiThue, soLuongToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                super.toString()+

                '}';
    }
}
