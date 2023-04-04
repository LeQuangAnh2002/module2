package codegym.com.demo;

public class SimpleCirle {
    double radius;
    SimpleCirle(){
        radius = 1;
    }
    SimpleCirle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
