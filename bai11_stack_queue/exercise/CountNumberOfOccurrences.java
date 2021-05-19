package bai11_stack_queue.exercise;
import java.util.HashMap;
import java.util.Set;


public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        String string = "abcd1Abcd2Dabc3";
        System.out.println("Chuỗi ban đầu: " + string);
        string = string.toLowerCase();
        String[] array = string.split("");

        HashMap<String, Integer> myHashMap = new HashMap<>();
        Set<String> keys = myHashMap.keySet();

        for (String word : array) {
            if (!keys.contains(word)) {
                myHashMap.put(word, 1);
            } else {
                int value = myHashMap.get(word);
                myHashMap.put(word, ++value);
            }
        }

        for (String key: keys) {
            System.out.println("Key: " + key + " : " + myHashMap.get(key));
        }
    }
}

