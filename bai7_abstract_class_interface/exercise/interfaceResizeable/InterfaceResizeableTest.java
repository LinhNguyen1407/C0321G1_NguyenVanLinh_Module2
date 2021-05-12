package bai7_abstract_class_interface.exercise.interfaceResizeable;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2,4);
        shapes[2] = new Square(5);

        System.out.println("Area of Circle, Rectangle, Square before resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            }
            else {
                System.out.println(((Rectangle) shape).getArea());
            }
        }

        System.out.println("Area of Circle, Rectangle, Square after resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.floor(Math.random()*100));
                System.out.println(((Circle) shape).getArea());
            }
            else {
                ((Rectangle) shape).resize(Math.floor(Math.random()*100));
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
