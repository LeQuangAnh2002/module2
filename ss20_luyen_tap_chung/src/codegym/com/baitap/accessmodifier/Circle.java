package codegym.com.baitap.accessmodifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", getArea= "+ getArea()+
                '}';
    }
}
