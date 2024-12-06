package org.test;

public class PalindromeCheck {

	public static void main(String[] args) {
		int number = 141414141; // Example input
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;           // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10;                     // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}