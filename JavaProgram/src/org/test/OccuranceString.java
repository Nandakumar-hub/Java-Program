package org.test;

import java.util.HashMap;

public class OccuranceString {
    public static void main(String[] args) {
        String input = "Automation tester123";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

       // Convert the string to lowercase to ensure case-insensitive counting
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            // Ignore spaces
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the character counts
        System.out.println("Character Counts:");
        for (char key : charCountMap.keySet()) {
            System.out.println(key + ": " + charCountMap.get(key));
        }
    }
}