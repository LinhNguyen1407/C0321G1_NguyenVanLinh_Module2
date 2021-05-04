package bai2_loop_array.exercise;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6,7}, {7,8,9}};
        System.out.println("Array list: ");
        for (int[] rows : arr) {
            for (int column : rows) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i< arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++){
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
