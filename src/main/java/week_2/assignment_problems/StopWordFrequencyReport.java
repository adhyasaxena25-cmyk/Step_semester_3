package main.java.week_2.assignment_problems;

import java.util.*;

public class StopWordFrequencyReport {
    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.isEmpty()) return;

        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is", "of", "in"));

        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();
        for (String w : words) {
            if (!w.isEmpty() && !stopWords.contains(w)) {
                freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
