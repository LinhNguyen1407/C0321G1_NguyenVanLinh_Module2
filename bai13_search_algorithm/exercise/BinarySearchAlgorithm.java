package bai13_search_algorithm.exercise;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }

        System.out.println("\nList after sort" );
        insertionSort(list);
        for (int value : list) {
            System.out.print(value + "\t");
        }

        System.out.println("\nEnter a element: ");
        int value = scanner.nextInt();
        int position = binarySearch (list, 0, list.length-1, value);
        if (position != -1) {
            System.out.println("Position of element " + value + " in array is " + position);
        } else {
            System.out.println("Not found this element in array");
        }
    }

    private static void insertionSort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = currentElement;
        }
    }

    private static int binarySearch (int[] array, int low, int high, int value) {
        if (low <= high) {
            int mid = (low + high)/2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                return binarySearch(array, mid+1, high, value);
            } else {
                return binarySearch(array, low, mid-1, value);
            }
        }
        return -1;
    }
}
