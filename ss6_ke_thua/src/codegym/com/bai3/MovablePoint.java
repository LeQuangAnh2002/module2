package codegym.com.bai3;

public class MovablePoint extends Ponit{
        private float xSpeed,ySpeed;

        public MovablePoint(){
            xSpeed = 0;
            ySpeed = 0;
        }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
            float[] arr = {this.xSpeed,this.ySpeed};
            return arr;
    }

    @Override
    public String toString() {
        return super.toString()+
                " speed" +","+xSpeed +","+ ySpeed;
    }
    public String move(float x, float y){
        x += xSpeed;
        y += ySpeed;
        return x + ","+ y;

    }
}
