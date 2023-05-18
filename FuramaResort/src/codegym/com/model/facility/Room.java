package codegym.com.model.facility;

import codegym.com.model.facility.Facility;

public class Room extends Facility {
    private String facility_free;

    public Room() {
    }

    public Room(String facility_free) {
        this.facility_free = facility_free;
    }

    public Room(String name, double area, double cost, int max_people, String facility_free) {
        super(name, area, cost, max_people);
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
        return "Room{" +
                "facility_free='" + facility_free + '\'' +
                super.toString()+
                '}';
    }
}
