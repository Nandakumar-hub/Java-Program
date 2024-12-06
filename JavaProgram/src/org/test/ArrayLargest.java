package org.test;

import java.util.Arrays;

public class ArrayLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 15, 30, 5};
        Arrays.sort(arr);
        System.out.println("Second Largest: " + arr[arr.length - 1]);
    }
}