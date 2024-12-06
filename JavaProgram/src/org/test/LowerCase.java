package org.test;

public class LowerCase {

	public static void main(String[] args) {
        String s = "CHENNAI";
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // Convert lowercase letters to uppercase by subtracting 32
                result.append((char) (c + 32));
            } else {
                // Append characters that are already uppercase or non-alphabetic
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
