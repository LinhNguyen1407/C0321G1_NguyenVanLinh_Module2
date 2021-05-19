package bai13_search_algorithm.exercise;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumLengthConsecutiveSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> maxSubString = new LinkedList<>();
        LinkedList<Character> tempList = new LinkedList<>();
        int j;
        for (int i = 0; i < string.length() - 1; i = j + 1) {
            tempList.add(string.charAt(i));
            for (j = i; j < string.length() - 1; j++) {
                if (string.charAt(j + 1) > string.charAt(j)) {
                    tempList.add(string.charAt(j + 1));
                } else {
                    break;
                }
            }
            if (tempList.size() > maxSubString.size()) {
                maxSubString.clear();
                maxSubString.addAll(tempList);
            }
            tempList.clear();
        }

        for (Character character : maxSubString) {
            System.out.print(character);
        }
    }
}

