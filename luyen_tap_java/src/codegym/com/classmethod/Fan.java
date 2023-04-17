package codegym.com.classmethod;

public class Fan {
    int SLOW = 1;
    int MEDIUM =2 ;
    int FAST =3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
    speed = SLOW;
    on = false;
    radius = 5;
    color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if(on){
            return "speed" + speed + ", color"+ color + ", radius" + radius +", fan is on";
        }else{
            return "color " + color + ", radius "+ radius+ " fan is off";
        }
    }
}
