package org.test;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;
		for (int i=1; i<=number; i++) {
			factorial = factorial * i;
		}
		System.err.println(factorial);
	}

}
