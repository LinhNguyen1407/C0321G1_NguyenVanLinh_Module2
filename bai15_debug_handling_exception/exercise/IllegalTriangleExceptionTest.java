package bai15_debug_handling_exception.exercise;
import java.util.Scanner;

public class IllegalTriangleExceptionTest extends IllegalTriangleException {
    public static void main(String[] args) {
        Double side1;
        Double side2;
        Double side3;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter side 1 of triangle:");
                side1 = Double.parseDouble(input.nextLine());
                System.out.println("Enter side 2 of triangle:");
                side2 = Double.parseDouble(input.nextLine());
                System.out.println("Enter side 3 of triangle:");
                side3 = Double.parseDouble(input.nextLine());
                checkSideOfTriangle(side1, side2, side3);
                break;
            } catch (Exception e) {
                System.err.println("Bạn hãy nhập lại");
            }
        }
        System.out.println("3 cạnh của tam giác lần lượt là " + side1 + "," + side2 + "," + side3);
    }
}
