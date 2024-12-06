package org.test;

public class ArrayCompare {
    public static void main(String[] args) {
        String[] expected = {"PASS", "FAIL", "PASS", "SKIPPED"};
        String[] actual = {"PASS", "FAIL", "FAIL", "SKIPPED"};

        for (int i = 0; i < expected.length; i++) {
            if (!expected[i].equals(actual[i])) {
                System.out.println("Mismatch at index " + i + ": expected=" + expected[i] + ", actual=" + actual[i]);
            }
        }
    }
}