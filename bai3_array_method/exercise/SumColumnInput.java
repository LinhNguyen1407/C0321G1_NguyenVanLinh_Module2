package bai3_array_method.exercise;
import java.util.Scanner;

public class SumColumnInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows of array: ");
        int rows = input.nextInt();
        System.out.print("Enter columns of array: ");
        int columns = input.nextInt();

        double[][] arr = new double[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element " + (i + 1) + "," + (j + 1) + " : ");
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("Array list: ");
        for (double[] row : arr) {
            for (double column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }

        int column;
        do {
            System.out.print("Enter column: ");
            column = input.nextInt();
        } while (column < 0 || column >= arr[0].length);

        double sum = 0;
        for (double[] value : arr) {
            sum += value[column];
        }
        System.out.print("Sum the elements of column " + column + " is " + sum);
    }
}
