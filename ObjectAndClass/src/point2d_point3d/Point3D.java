package point2d_point3d;
import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] toaDoXYZ = new float[3];
        toaDoXYZ[0] = super.getXY()[0];
        toaDoXYZ[1] = super.getXY()[1];
        toaDoXYZ[2] = this.z;
        return toaDoXYZ;
    }

    @Override
    public String toString(){
        return "Point có tọa độ là " + Arrays.toString(this.getXYZ());

    }

}
