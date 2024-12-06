package org.test;

public class ArraySearchInt {
    public static void main(String[] args) {
        int[] elementIDs = {1,2,3,4,5};
        int searchID = 3;
        boolean found = false;

        for (int i = 0; i < elementIDs.length; i++) {
            if (elementIDs[i] == searchID) {
                System.out.println(searchID + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchID + " not found.");
        }
    }
}