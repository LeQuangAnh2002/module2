package codegym.com.bai3;

public class Ponit {
    private float x,y;

    public Ponit() {
     x = 0;
     y =0;
    }

    public Ponit(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y ;

    }
    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Ponit{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
