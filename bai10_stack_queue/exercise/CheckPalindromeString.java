package bai10_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        System.out.println("Is String a Palindrome : " + checkPalindromeString(string));
    }

    private static boolean checkPalindromeString(String string) {
        Stack<String> stack = new Stack();
        Queue<String> queue = new LinkedList();
        string = string.toLowerCase();
        String[] array = string.split("");
        for (String element : array) {
            stack.push(element);
            queue.offer(element);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (!stack.isEmpty()) {
                boolean check = stack.pop().equals(queue.remove());
                if (!check) {
                    return false;
                }
            }
        }
        return true;
    }
}
