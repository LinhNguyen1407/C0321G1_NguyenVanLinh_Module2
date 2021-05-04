package bai3_array_method.exercise;
import java.util.Scanner;

public class ArrayAggregation {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of arr1: ");
        int i = 0;
        while (i < arr1.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Arr1 list: ");
        for (int element : arr1) {
            System.out.print(element + "\t");
        }

        System.out.println("\nEnter the elements of arr2: ");
        int j = 0;
        while (j < arr2.length) {
            System.out.print("Enter element " + (j + 1) + " : ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        System.out.print("Arr2 list: ");
        for (int element : arr2) {
            System.out.print(element + "\t");
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i1 = 0; i1 < arr1.length; i1++) {
            arr3[i1] = arr1[i1];
        }
        for (int j1 = 0; j1 < arr2.length; j1++) {
            arr3[j1 + arr1.length] = arr2[j1];
        }
        System.out.print("\nArr3 list: ");
        for (int element : arr3) {
            System.out.print(element + "\t");
        }
    }
}
