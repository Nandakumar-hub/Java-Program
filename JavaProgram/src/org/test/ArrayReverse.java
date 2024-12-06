package org.test;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] steps = {1,2,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(steps));

        for (int i = 0; i < steps.length / 2; i++) {
            int temp = steps[i];
            steps[i] = steps[steps.length - 1 - i];
            steps[steps.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(steps));
    }
}