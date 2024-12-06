package org.test;

public class VowelCheck {
	public static void main(String[] args) {
        // Word to check
        String word = "Java";

        // Loop through each character in the word
        System.out.print("Vowels in the word '" + word + "': ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Convert character to lowercase to handle both uppercase and lowercase vowels
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");  // Print the vowel
            }
        }
    }
}