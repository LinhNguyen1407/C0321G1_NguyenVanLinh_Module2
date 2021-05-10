package bai6_inheritance.exercise.CircleCylinder;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {
    }

    public Cylinder (String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    void setHeight (double height) {
        this.height = height;
    }

    double getHeight () {
        return this.height;
    }

    double getVolumns () {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return  "Cylinder has volumn " + getVolumns()
                + ", which is a subclass of " + super.toString();
    }
}
