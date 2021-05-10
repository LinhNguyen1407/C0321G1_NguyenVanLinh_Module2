package bai6_inheritance.exercise.Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("green");
        System.out.println(shape);
    }
}
