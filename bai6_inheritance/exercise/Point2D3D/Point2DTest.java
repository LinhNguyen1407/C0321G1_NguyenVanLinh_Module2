package bai6_inheritance.exercise.Point2D3D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(15, 15);
        System.out.println(point2D);

        point2D.setXY(20, 20);
        System.out.println(point2D);
    }
}
