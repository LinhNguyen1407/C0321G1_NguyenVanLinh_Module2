package bai3_array_method.exercise;
import java.util.Scanner;

public class CountCharacterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "hello world. i am monday";
        System.out.println(str);
        System.out.print("Enter character: ");
        char charName = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charName) {
                count++;
            }
        }
        System.out.println(charName + " appear in string " + count + " times");
    }
}
