package bai6_inheritance.exercise.Triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle () {
    }

    Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle (double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void setSide1 (double side1) {
        this.side1 = side1;
    }

    double getSide1 () {
        return this.side1;
    }

    void setSide2 (double side2) {
        this.side2 = side2;
    }

    double getSide2 () {
        return this.side2;
    }

    void setSide3 (double side3) {
        this.side3 = side3;
    }

    double getSide3 () {
        return this.side3;
    }

    double getArea () {
        double temp = (this.side1 + this.side2 + this.side3)/2;
        return Math.pow((temp*(temp-this.side1)*(temp-this.side2)*(temp-this.side3)), 0.5);
    }

    double getPerimeter () {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle with 3 sides "
                + getSide1() + " , "
                + getSide2() + " , "
                + getSide3()
                + " and area " + getArea() + " , "
                + " perimeter " + getPerimeter() + " , "
                + " a subclass of " + super.toString();
    }
}
