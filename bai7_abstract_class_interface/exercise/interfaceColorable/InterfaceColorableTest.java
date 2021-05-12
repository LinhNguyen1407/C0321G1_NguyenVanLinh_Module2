package bai7_abstract_class_interface.exercise.interfaceColorable;

public class InterfaceColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Square(5);

        System.out.println("List array shapes");
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("Area of Square: ");
                System.out.println(((Square) shape).getArea());
                ((Square) shape).howToColor();
            } else if (shape instanceof Circle) {
                System.out.println("Area of Circle: ");
                System.out.println(((Circle) shape).getArea());
            } else {
                System.out.println("Area of Rectangle: ");
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
