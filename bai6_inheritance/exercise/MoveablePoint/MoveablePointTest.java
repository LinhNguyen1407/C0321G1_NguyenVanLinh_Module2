package bai6_inheritance.exercise.MoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(10, 10);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5, 5, 20, 20);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
