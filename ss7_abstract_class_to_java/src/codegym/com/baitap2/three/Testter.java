package codegym.com.baitap2.three;

import codegym.com.baitap2.photo.Circle;
import codegym.com.baitap2.photo.Rectangle;
import codegym.com.baitap2.photo.Shape;

public class Testter {
    public static void main(String[] args) {
        double x = (Math.random()* 10);
;        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(x,"green",false);
        shapes[1] = new Circle(22,"blue",false);
        shapes[2] = new Rectangle(2,2,"blue", true);
        shapes[3] = new Rectangle(x,x,"yellow", true);
        for (Shape shape: shapes){

            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
//
            }else{
                System.out.println("Diện tích :"+((Rectangle) shape).getArea()*Math.PI);
            }

        }



    }
}
