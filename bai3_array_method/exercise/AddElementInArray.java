package bai3_array_method.exercise;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a element to add: ");
        int number = input.nextInt();
        System.out.println("Enter position to insert: ");
        int index = input.nextInt();
        if (index <= 1 || index >= arr.length) {
            System.out.println("Can not insert into this position");
        } else {
            for (int i = arr.length - 2; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = number;
            System.out.println("Array after insert element: " + number + " into position " + index);
            for (int element : arr) {
                System.out.print(element + "\t");
            }
        }
    }
}
