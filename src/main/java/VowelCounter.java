/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class VowelCounter {
    

    // Method to count vowels in a given sentence
    public static int countVowels(String sentence) {
        int count = 0;
        String vowels = "aeiou"; // All vowel characters for easy checking

        // Convert sentence to lowercase to handle both uppercase and lowercase vowels
        sentence = sentence.toLowerCase();

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i); // Access each character individually

            // If the character is a vowel, increase the count
            if (vowels.indexOf(currentChar) >= 0) {
                count++;
            }
        }

        return count; // Return the total count of vowels found
    }
}