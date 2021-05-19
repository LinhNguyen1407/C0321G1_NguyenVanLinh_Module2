package bai13_search_algorithm.exercise;
import java.util.Scanner;
import java.util.LinkedList;

public class longestAscendingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> maxSubString = new LinkedList<>();
        LinkedList<Character> tempList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
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
