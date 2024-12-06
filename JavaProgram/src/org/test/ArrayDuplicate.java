package org.test;

import java.util.HashSet;

public class ArrayDuplicate {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Apple", "Mango", "Orange"};
        HashSet<String> set = new HashSet<>();
        System.out.println("Duplicate Elements:");

        for (String fruit : fruits) {
            if (!set.add(fruit)) {
                System.out.println(fruit);
            }
        }
    }
}