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
        quadraticEquation.solveEquation();
    }
}
