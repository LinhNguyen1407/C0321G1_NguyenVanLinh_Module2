package bai5_access_modifier.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area: %.2f ", circle.getArea());
    }
}
