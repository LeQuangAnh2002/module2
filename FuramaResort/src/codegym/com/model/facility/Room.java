package codegym.com.model.facility;

import codegym.com.model.facility.Facility;

public class Room extends Facility {
    private String facility_free;

    public Room() {
    }

    public Room(String facility_free) {
        this.facility_free = facility_free;
    }

    public Room(String maDichVu, String tenDichVu, double chiPhiThue, int soLuongToiDa, String kieuThue, String facility_free) {
        super(maDichVu, tenDichVu, chiPhiThue, soLuongToiDa, kieuThue);
        this.facility_free = facility_free;
    }

    public String getFacility_free() {
        return facility_free;
    }

    public void setFacility_free(String facility_free) {
        this.facility_free = facility_free;
    }

    @Override
    public String toString() {
        return   super.toString()+ " - " + facility_free ;
    }
}
