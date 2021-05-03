package bai2_vong_lap_trong_java.exercise;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the square triangle: top-left");
            System.out.println("2. Print the square triangle: top-right");
            System.out.println("3. Print the square triangle: bottom-left");
            System.out.println("4. Print the square triangle: bottom-right");
            System.out.println("5. Print the isosceles triangle");
            System.out.println("6. Print the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the square triangle: top-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle: top-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print the square triangle: bottom-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("Print the square triangle: bottom-right");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j <= 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 5:
                    System.out.println("Print the isosceles triangle");
                    int a = 5, b = 5;
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j <= 9; j++) {
                            if (j >= a && j <= b) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        a--;
                        b++;
                        System.out.print("\n");
                    }
                    break;
                case 6:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 15; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
