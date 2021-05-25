package bai15_debug_handling_exception.exercise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter side 1 of triangle:");
                double side1 = Double.parseDouble(input.nextLine());
                System.out.println("Enter side 2 of triangle:");
                double side2 = Double.parseDouble(input.nextLine());
                System.out.println("Enter side 3 of triangle:");
                double side3 = Double.parseDouble(input.nextLine());
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println(triangle);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Giá trị nhập vào không phải là số. Vui lòng nhập lại !");
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                System.err.println("3 cạnh nhập vào không hợp lệ. Vui lòng nhập lại !");
            }
        }
    }
}
