package bai10_stack_queue.exercise;

import java.util.Arrays;
import java.util.Stack;

public class MyStackPerform {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array before: " + Arrays.toString(array));
        stackOfIntegers(array);
        System.out.println("Array after: " + Arrays.toString(array));

        String string = "Today is a beautiful day";
        stackOfString(string);
    }

    private static void stackOfIntegers(int[] array) {
        Stack<Integer> stack = new Stack();
        for (int value : array) {
            stack.push(value);
        }
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Pop elements from stack : ");
        int size = stack.size();
        for (int j = 0; j < size; j++) {
            if (!stack.isEmpty()) {
                array[j] = stack.pop();
                System.out.print("\t" + array[j]);
            }
        }
        System.out.println("\nSize of stack after: " + stack.size());
    }

    private static void stackOfString(String string) {
        Stack<String> stack = new Stack();
        System.out.println("String before: " + string);
        String[] array = string.split(" ");
        for (String str : array) {
            stack.push(str);
        }
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Pop elements from stack : ");
        int size = stack.size();
        String stringAfter = "";
        for (int j = 0; j < size; j++) {
            if (!stack.isEmpty()) {
                array[j] = stack.pop();
                System.out.print("\t" + array[j]);
                stringAfter = (stringAfter).concat(array[j]).concat(" ");
            }
        }
        System.out.println("\nSize of stack after: " + stack.size());
        System.out.println("String after: " + stringAfter);
    }
}
