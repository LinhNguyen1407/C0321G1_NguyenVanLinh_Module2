package bai5_access_modifier.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle () {
        radius = 1.0;
    }
    Circle (double r) {
        radius = r;
    }

    public double getRadius () {
        return radius;
    }
    public double getArea () {
        return radius*radius*Math.PI;
    }
}
