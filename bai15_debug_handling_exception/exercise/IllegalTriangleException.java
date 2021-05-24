package bai15_debug_handling_exception.exercise;

public class IllegalTriangleException {
    public static void checkSideOfTriangle(double side1, double side2, double side3) throws Exception {
        boolean check1 = side1 <= 0 || side2 <= 0 || side3 <= 0;
        boolean check2 = (side1 + side2) < side3 || (side1 + side3) < side2 || (side2 + side3) < side1;
        if (check1 || check2) {
            throw new Exception("3 cạnh nhập vào không hợp lệ");
        }
    }
}

