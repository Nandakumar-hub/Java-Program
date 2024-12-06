package org.test;

import java.util.HashMap;

public class ArrayFilter {

    public static void main(String[] args) {
        String[] statuses = {"PASS", "FAIL", "PASS", "SKIPPED", "FAIL"};
        HashMap<String, Integer> countMap = new HashMap<>();

        for (String status : statuses) {
            countMap.put(status, countMap.getOrDefault(status, 0) + 1);
        }

        System.out.println("Status Counts: " + countMap);
    }
}
