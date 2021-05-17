package bai11_stack_queue.exercise;
import java.util.Stack;
import java.util.Scanner;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a expression: ");
        String string = input.nextLine();
        System.out.println("Check the brackets in the expression: " + checkBrackets(string));
    }

    private static boolean checkBrackets(String string) {
        Stack<String> stack = new Stack<>();
        String[] array = string.split("");
        for (String symbol : array) {
            switch (symbol) {
                case "(":
                case "{":
                    stack.push(symbol);
                    break;
                case ")":
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.pop().equals("{"))
                            return false;
                    }
                    break;
                case "}":
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.pop().equals("("))
                            return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
