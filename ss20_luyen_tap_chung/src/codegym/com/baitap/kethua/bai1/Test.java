package codegym.com.baitap.kethua.bai1;

public class Test
{
    public static void main(String[] args) {
        System.out.println("Lớp Circle : ");
        Circle circle = new Circle();
        circle = new Circle(20,"bule");
        System.out.println(circle.toString());
        System.out.println("Lớp Cylinder :");
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(10);
        System.out.println(cylinder.toString());
    }
}
