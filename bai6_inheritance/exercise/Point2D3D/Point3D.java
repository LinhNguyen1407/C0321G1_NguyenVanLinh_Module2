package bai6_inheritance.exercise.Point2D3D;

public class Point3D extends Point2D {
    private float z = 10;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    void setZ(float z) {
        this.z = z;
    }

    float getZ() {
        return this.z;
    }

    void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;

    }

    float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D có tọa độ z là " + getZ() + " là lớp con của " + super.toString();
    }
}
