package org.test;

public class AdjacentArray {
    public static void main(String[] args) {
        // Max difference between any adjacent index in array
        int[] a = {1, 4, 8, 15, 17}; // Sample array

        // Initialize the variable diff to store the maximum difference
        int diff = Integer.MIN_VALUE; // Start with the lowest possible value

        // Loop through the array to find the maximum difference between adjacent elements
        for (int i = 0; i < a.length - 1; i++) {
            // Calculate the difference between the current element and the next element
            int currentDiff = a[i + 1] - a[i];

            // Update the diff if currentDiff is greater than the previous diff
            if (currentDiff > diff) {
                diff = currentDiff;
            }
        }

        // Output the maximum difference
        System.out.println("Maximum difference between adjacent elements: " + diff);
    }
}
