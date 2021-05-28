package bai19_string_regex.exercise.validate_class_name;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassName classNames = new ClassName();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a class name: ");
            String className = scanner.nextLine();
            if (className.equals("q")) {
                break;
            }
            boolean isValid = classNames.validate(className);
            System.out.println("Class name is " + className +" is valid: "+ isValid);
        }
    }
}
