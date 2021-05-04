package bai2_loop_array.exercise;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter element to delete: ");
        int number = input.nextInt();
        boolean isExsit = false;
        int index = 0;
        for(int i=0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                isExsit = true;
                break;
            }
        }
        if (isExsit) {
            for (int j = index; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
            System.out.println("Array after delete element: " + number);
            for (int element: arr) {
                System.out.print(element + "\t");
            }
        } else {
            System.out.println("Element is not exsit in array");
        }
    }
}
