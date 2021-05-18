package bai11_stack_queue.exercise;
import java.util.HashMap;
import java.util.Set;


public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        String string = "abcd1Abcd2Dabc3";
        System.out.println("Chuỗi ban đầu: " + string);
        string = string.toLowerCase();

        HashMap<Character, Integer> myHashMap = new HashMap<>();
        Set<Character> keys = myHashMap.keySet();

        for (int i = 0; i < string.length(); i++) {
            Character temp = string.charAt(i);
            if(!keys.contains(temp)) {
                myHashMap.put(temp, 1);
            } else {
                int value = myHashMap.get(temp);
                myHashMap.put(temp, ++value);
            }
        }

        for (Character key: keys) {
            System.out.println("Key: " + key + " : " + myHashMap.get(key));
        }
    }
}

