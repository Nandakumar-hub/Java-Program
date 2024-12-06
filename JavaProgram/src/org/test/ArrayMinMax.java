package org.test;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {45, 2, 9, 18, 100, 55};
        int max = numbers[0], min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}