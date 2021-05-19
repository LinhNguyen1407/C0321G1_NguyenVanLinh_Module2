package bai11_stack_queue.exercise;

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

        for (int i = 0; i < array.length / 2; i++) {
            stack.push(array[i]);
        }
        boolean checkResidual = array.length % 2 == 0;
        if (checkResidual) {
            for (int j = array.length / 2; j < array.length; j++) {
                queue.offer(array[j]);
            }
        } else {
            for (int j = array.length / 2 + 1; j < array.length; j++) {
                queue.offer(array[j]);
            }
        }

        while (!stack.isEmpty()) {
            boolean check = stack.pop().equals(queue.remove());
            if (!check) {
                return false;
            }
        }
        return true;
    }
}
