package codegym.com.thuchanh.arraylist;

import java.util.Objects;

public class Students implements Comparable<Students>{
    private String id;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public Students() {
    }

    public Students(String id) {
        this.id = id;
    }

    public Students(String id, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Students => " +
                " id='" + id + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh
                ;
    }

    @Override
    public int compareTo(Students o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(id, students.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
