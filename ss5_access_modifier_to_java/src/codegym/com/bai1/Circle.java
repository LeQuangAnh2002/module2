package codegym.com.bai1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius( double radius){
        this.radius = radius;
    }
    public String getColor(){
        return  this.color;
    }
    public double getRadius(){

        return this.radius;
    }
    public double getArea(){

        return Math.PI * Math.pow(this.radius,2);
    }
}
