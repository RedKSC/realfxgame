package sample;


import java.util.Scanner;

public class SortMethod {
    public static void main(String[] args) {
        Scanner scannedPhrase = new Scanner(System.in);
        String word = scannedPhrase.nextLine();
        String[] compatibleWords = {"cow", "dog", "horse", "pig"};
        boolean wordFound = false;
        for (int i = 0; i < compatibleWords.length; i++) {
        /*for loop goes through each word and runs this while loop until each letter of the compatible words string
        is broken up and compared to the chosen word*/
            int g = 0;
            boolean nextWord = false;
            while (!wordFound & !nextWord) {
                /*the main problem is if the scanned word has all of the characters with more, it still verifies as found*/
                if (g == compatibleWords[i].length()) {
                    System.out.println("The word is found. The word that you inserted was " + word + ".");
                    wordFound = true;
                } else if (compatibleWords[i].charAt(g) == word.charAt(g)) {
                    g++;
                } else {
                    nextWord = true;
                    if (i == (compatibleWords.length - 1)){
                        System.out.println("The word is not found. The word that you inserted was " + word + ".");
                    }
                }
            }
        }
    }
}

