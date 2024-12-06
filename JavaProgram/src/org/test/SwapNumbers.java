package org.test;

public class SwapNumbers {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println("Before Swapping - "+"i value is "+i+", J value is "+j);
		
		i = i+j;
		j = i-j;
		i = i-j;
		System.out.println("After Swapping - "+"i value is "+i+", J value is "+j);
	}

}
