package codegym.com.demo.kethua.shapes;

public class Circle extends Shape{
    private double raduis;

    public Circle() {
        raduis =1.0;
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public Circle(String color, boolean filled, double raduis) {
        super(color, filled);
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }
    public double getArea(){
        return raduis * raduis * Math.PI;
    }
    public double getPerimeter(){
        return 2 * raduis * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRaduis()
                + ", which is a subclass of "+
         super.toString();
    }
}
