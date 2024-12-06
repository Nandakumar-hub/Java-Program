package org.test;

public class EvenNumber {

	public static void main(String[] args) {
		int start = 4;
		int end = 100;
		while (start <= end) {
			if (start %2 == 0)
				System.out.println(start);
			start++;
		}
	}

}
