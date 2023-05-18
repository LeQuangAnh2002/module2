package codegym.com.demo.kethua.shape;

public class Circle extends Geometric {

    private double radius;

    public Circle() {
    }

    public Circle(double readius) {
        this.radius = readius;
    }

    public Circle(String color, String filled, double readius) {
        super(color, filled);
        this.radius = readius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2* radius * Math.PI;
    }
    public double getDiameter(){
        return 2* radius;
    }
    public void printCircle(){
        System.out.println("The" + getColor()+ " circle is created with the radius is "+ radius);
    }
}
