package codegym.com.baitap.kethua.bai1;

public class Cylinder extends Circle{
        private double height;

    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * getRadius() * getRadius() * this.height;
    }

    @Override
    public String toString() {
        return getHeight()+
                " thể tích hình trụ "+
                getVolume()
                +
                super.toString();
    }
}
