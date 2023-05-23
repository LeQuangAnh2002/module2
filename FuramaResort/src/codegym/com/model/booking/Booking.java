package codegym.com.model.booking;

public class Booking {
    private String maBooking;
    private String ngayBooking;
    private  String ngayBatDau;
    private String ngayKetThuc;
    private String maKhachHang;
    private String maDichVu;

    public Booking(String maBooking, String ngayBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, String maDichVu) {
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBooking() {
        return ngayBooking;
    }

    public void setNgayBooking(String ngayBooking) {
        this.ngayBooking = ngayBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayBooking='" + ngayBooking + '\'' +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                '}';
    }
}
