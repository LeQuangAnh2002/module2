package codegym.com.baitap1.one;

import codegym.com.baitap1.image.Circle;
import codegym.com.baitap1.image.Rectangle;
import codegym.com.baitap1.image.Shape;
import codegym.com.baitap1.image.Square;

public class ResizeableTest
{
    public static void main(String[] args) {
        int x =(int) (Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x,"yellow", true);
        shapes[1] = new Rectangle(x,x,"red",false);
        shapes[2] = new Square(x,"blue",false);
        for (Shape shape :shapes){
            System.out.println(shape);
        }

    }
}
