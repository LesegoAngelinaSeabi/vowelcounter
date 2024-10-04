/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask5;
import java.util.Scanner;

public class VowelCounter {

    //  counts the number of vowels in a string
    public static int countVowels(String sentence) {
       
        sentence = sentence.toLowerCase();
        int vowelCount = 0;

        
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            // Check if the current character is a vowel
            if ("aeiou".indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
// Call the countVowels function and display the result
        int numberOfVowels = countVowels(input);
        System.out.println("Number of vowels: " + numberOfVowels);
        
        scanner.close();
    }
}

    