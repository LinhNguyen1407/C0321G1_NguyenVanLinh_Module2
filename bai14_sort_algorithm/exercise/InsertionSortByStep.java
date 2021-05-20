package bai14_sort_algorithm.exercise;
import java.util.Scanner;

public class InsertionSortByStep {
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

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = currentElement;

            System.out.print("List after the  " + i + "' sort: ");
            for (int value : array) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
