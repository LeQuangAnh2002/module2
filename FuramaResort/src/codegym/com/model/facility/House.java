package codegym.com.model.facility;

import codegym.com.model.facility.Facility;

public class House extends Facility {
        private String tieuChuanPhong;
        private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String maDichVu, String tenDichVu, double chiPhiThue, int soLuongToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, tenDichVu, chiPhiThue, soLuongToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }


    @Override
    public String toString() {
        return super.toString()+ " - "+
                 tieuChuanPhong + " - " +
                 soTang

             ;
    }
}
