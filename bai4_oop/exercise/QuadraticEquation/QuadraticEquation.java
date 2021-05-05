package bai4_oop.exercise.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return this.a;
    }

    double getB() {
        return this.b;
    }

    double getC() {
        return this.c;
    }

    double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    double getRoot1() {
        double delta = getDiscriminant();
        double root1 = (-this.b + Math.pow(delta, 0.5)) / (2 * this.a);
        return root1;
    }

    double getRoot2() {
        double delta = getDiscriminant();
        double root2 = (-this.b - Math.pow(delta, 0.5)) / (2 * this.a);
        return root2;
    }
}
