package ss06_inheritance_polymorphism.exercise.point2d_point3d.model;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        this.getX();
        this.getY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    public String toString() {
        return super.toString() + ", Z: " + z;
    }
}
