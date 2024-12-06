package org.test;

public class ArraySum {
    public static void main(String[] args) {
        int[] executionTimes = {15, 20, 10, 5, 25};
        int sum = 0;

        for (int time : executionTimes) {
            sum += time;
        }
        System.out.println("Total Execution Time: " + sum);
    }
}