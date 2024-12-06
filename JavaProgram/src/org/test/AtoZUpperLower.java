package org.test;

public class AtoZUpperLower {

	public static void main(String[] args) {
        

        System.out.println("UPPERCASE");
        
        for (char ch = 'A'; ch<='Z'; ch++) {
        	System.out.println(ch + " ");
        }
        System.out.println("\n");
        
        System.out.println("lowercase");
        
        for (char ch = 'a'; ch<='z'; ch++) {
        	System.out.println(ch + " ");
        }
        System.out.println("\n");
    }
}
