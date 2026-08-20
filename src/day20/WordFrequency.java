package day20;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);

            } else {
                frequency.put(word, 1);
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        String text = "Java is easy and Java is powerful";
        Map<String, Integer> result = countWords(text);
        System.out.println(result);
    }
}
