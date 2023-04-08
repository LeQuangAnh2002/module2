package codegym.com.bai2;

public class Point3D extends  Point2D{
    private  float z;


    public  Point3D(){
        z = 0;
    }


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z)
    {
        super.setXY(x,y);

        this.z=z;
    }
    public  float[] getXYZ(){
         float[] arr={this.getX(),this.getY(),z};
         return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                super.toString()+
                '}';
    }
}
