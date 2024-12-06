package org.test;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] responseTimes = {500, 200, 800, 400, 100};
        Arrays.sort(responseTimes);

        System.out.println("Sorted Response Times: " + Arrays.toString(responseTimes));
    }
}