import codegym.com.baitap2.photo.Circle;
import codegym.com.baitap2.photo.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Circle(3);

        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }
}