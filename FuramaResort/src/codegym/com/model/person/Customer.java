package codegym.com.model.person;

import java.io.Serializable;

public class Customer extends Person  {
    private String ngaySinh;
    private String soCMND;
    private String loaiKhach;


    public Customer() {
    }

    public Customer(String ngaySinh, String soCMND, String loaiKhach) {
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.loaiKhach = loaiKhach;
    }

    public Customer(String id, String name, int age, String address, String phone, String gender, String email, String ngaySinh, String soCMND, String loaiKhach) {
        super(id, name, age, address, phone, gender, email);
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.loaiKhach = loaiKhach;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    @Override
    public String toString() {
        return super.toString()
                +" - "+ ngaySinh
                +" - "+ soCMND
                +" - "+ loaiKhach;
    }
}
