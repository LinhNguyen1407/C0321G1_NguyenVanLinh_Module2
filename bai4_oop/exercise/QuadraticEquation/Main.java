package bai4_oop.exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.print("Equation has 2 roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.print("Equation has 1 root: " + quadraticEquation.getRoot1());
        } else {
            System.out.print("Equation has no roots");
        }
    }
}
