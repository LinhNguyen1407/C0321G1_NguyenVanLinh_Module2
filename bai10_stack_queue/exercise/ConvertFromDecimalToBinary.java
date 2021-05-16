package bai10_stack_queue.exercise;
import java.util.Scanner;
import java.util.Stack;

public class ConvertFromDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Convert into decimal: ");
        convertDecimalToBinary(number);
    }

    private static void convertDecimalToBinary (int number) {
        Stack<Integer> stack = new Stack();
        boolean check = number/2 != 0;
        String result = "";
        while (check) {
            int integerResult  = number/2;
            int residualResult = number%2;
            stack.push(residualResult);
            check = integerResult != 0;
            number = integerResult;
        }
        int size = stack.size();
        for (int i = 0; i < size ; i++) {
            result = result.concat(stack.pop().toString());
        }
        System.out.println(result);
    }
}
