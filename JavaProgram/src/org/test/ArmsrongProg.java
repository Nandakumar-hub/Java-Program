package org.test;

public class ArmsrongProg {
	public static void main(String[] args) {
		int number=154;
		int rem,original,result=0;
		original=number;
		while(original!=0) {
			rem=original%10;
			result+=Math.pow(rem, 3);
			original/=10;
		}
		if(result==number) {
		System.out.println("Is armstrong");
		}
	else {
		System.out.println("not armstrong");
	}

		
	}
	}
