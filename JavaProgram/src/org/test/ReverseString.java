package org.test;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Chennai");
		
		String s = "Chennai";
		
//		Using StringBuffer
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
//		Using for loop
		String rev = "";
		int len = s.length();//7
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
