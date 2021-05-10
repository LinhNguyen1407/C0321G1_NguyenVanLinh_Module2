package bai6_inheritance.exercise.CircleCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder("yellow", 1.5, 3);
        System.out.println(cylinder);
    }
}
