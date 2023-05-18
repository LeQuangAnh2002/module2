package codegym.com.baitap.abstractbaitap.resizeable;

public class Test
{
    public static void main(String[] args) {
        int x =(int) (Math.random() * 10);
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(x,"bule",true);
        shapes[1] = new Rectangle(x,x,"red",false);

        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }
}
