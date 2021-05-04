package bai3_array_method.exercise;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Array list: ");
        for (double[] rows : arr) {
            for (double columns : rows) {
                System.out.print(columns + "\t");
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
