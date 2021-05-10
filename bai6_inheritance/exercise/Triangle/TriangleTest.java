package bai6_inheritance.exercise.Triangle;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("Enter 3 side of triangle: ");
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter color of triangle: ");
        String color = input.next();

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle);

        triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
