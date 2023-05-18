package codegym.com.model.facility;

public abstract class Facility {
        private String name;
        private double area;
        private double cost;
        private int max_people;

    public Facility() {
    }

    public Facility(String name, double area, double cost, int max_people) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.max_people = max_people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMax_people() {
        return max_people;
    }

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", max_people=" + max_people +
                '}';
    }
}