package codegym.com.demo;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị  vào ");
        double radius = sc.nextDouble();
        Circle circle1 = new Circle();
        System.out.println("Ban đầu "+circle1.getRadius());

        Circle circle2 = new Circle(radius);
        System.out.println("Bán kính "+ circle2.getArea());
    }
}
