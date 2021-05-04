package bai3_array_method.exercise;

public class MainDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Array list: ");
        for (int[] rows : arr) {
            for (int columns : rows) {
                System.out.print(columns + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Sum the element of main diagonal is " + sum);
    }
}
