package org.test;

import java.util.Set;
import java.util.TreeSet;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {
        int[] testIDs = {101, 102, 103, 101, 104, 102};
        Set<Integer> uniqueSet = new TreeSet<>();

        for (int id : testIDs) {
            uniqueSet.add(id);
        }

        System.out.println("Unique IDs: " + uniqueSet);
    }
}
