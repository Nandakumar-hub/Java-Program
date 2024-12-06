package org.test;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 13131313; // Example input
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;           // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number = number/10;                     // Remove the last digit
        }
        System.out.println(reversedNumber);
}
}