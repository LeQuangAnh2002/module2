package codegym.com.model.facility;

import codegym.com.model.facility.Facility;

public class Villa extends Facility {
    private String standard_room;
    private String description;

    public Villa() {
    }

    public Villa(String standard_room, String description) {
        this.standard_room = standard_room;
        this.description = description;
    }

    public Villa(String name, double area, double cost, int max_people, String standard_room, String description) {
        super(name, area, cost, max_people);
        this.standard_room = standard_room;
        this.description = description;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard_room='" + standard_room + '\'' +
                ", description='" + description + '\'' +
                super.toString()+
                '}';
    }
}
