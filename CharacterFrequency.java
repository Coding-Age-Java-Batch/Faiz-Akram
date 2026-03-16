package Stringgg;

public class CharacterFrequency {

    public static void printFrequency(String str) {
        str = str.toLowerCase();
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character is alphabet
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        // Print result
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char letter = (char)(i + 'a');
                System.out.println(letter + ":" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        printFrequency("Programming");
    }
}