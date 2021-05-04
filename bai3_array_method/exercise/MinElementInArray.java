package bai3_array_method.exercise;
import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Array list: ");
        for (int element : arr) {
            System.out.print(element + "\t");
        }

        int min = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                index = j;
            }
        }
        System.out.print("\nMin element in array: " + min + " at position " + index);
    }
}
