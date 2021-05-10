package bai6_inheritance.exercise.Point2D3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(12, 12, 12);
        System.out.println(point3D);

        point3D.setXYZ(14, 14, 14);
        System.out.println(point3D);
    }
}
