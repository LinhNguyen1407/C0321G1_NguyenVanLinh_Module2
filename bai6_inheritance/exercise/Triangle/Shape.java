package bai6_inheritance.exercise.Triangle;

import java.security.PublicKey;

public class Shape {
    private String color = "blue";

    Shape () {
    }

    Shape (String color) {
        this.color = color;
    }

    void setColor (String color) {
        this.color = color;
    }

    String getColor () {
        return this.color;
    }

    public String toString () {
        return "Shape with color " + getColor();
    }
}
