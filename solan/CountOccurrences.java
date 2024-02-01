package solan;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3, 4, 3, 5};

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int number : numbers) {
            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            } else {
                occurrences.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Số " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }
    }
}

