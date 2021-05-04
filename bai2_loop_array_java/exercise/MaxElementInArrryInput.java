package bai2_loop_array.exercise;
import java.util.Scanner;

public class MaxElementInArrryInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows of array: ");
        int rows = input.nextInt();
        System.out.print("Enter columns of array: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element " + (i + 1) + "," + (j + 1) + " : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Array list: ");
        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }

        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Max element in array: " + max + " at position " + x + " , " + y);
    }
}
