package codegym.com.demo;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCirle circle1 = new SimpleCirle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        SimpleCirle circle2 = new SimpleCirle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

}
