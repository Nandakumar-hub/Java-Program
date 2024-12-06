package org.test;

public class NoOfDigit {

	public static void main(String[] args) {
		int num = 1234567;
		int noOfDigit = 0;
		while (num != 0) {
			num = num/10;
			noOfDigit++;
		}
		System.out.println(noOfDigit);
	}

}
