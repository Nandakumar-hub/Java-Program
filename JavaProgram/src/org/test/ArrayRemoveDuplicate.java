package org.test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayRemoveDuplicate {
	public static void main(String[] args) {
        // Input array with duplicates
        int[] arrayWithDuplicates = {1, 2, 3, 1, 2, 4, 5};

        // Remove duplicates using LinkedHashSet
        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        // Print the result
        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }

    public static int[] removeDuplicates(int[] array) {
        // Create a LinkedHashSet to store unique elements
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Add each element of the array to the set
        for (int i : array) {
            set.add(i);
        }

        // Convert the set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }
}
