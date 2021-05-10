package bai6_inheritance.exercise.CircleCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }



    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle has color " + getColor() + " with radius " + getRadius();
    }
}
