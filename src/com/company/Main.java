package com.company;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static void originalHangman(int count, String actualWord) {
        if (count == 0) {
            System.out.println("_____");
            System.out.println("|  |");
            System.out.println("|  ");
            System.out.println("| ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("You have 5 total guesses.");
        } else if (count == 1) {
            System.out.println("_____");
            System.out.println("|  |");
            System.out.println("|  0");
            System.out.println("| ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("You have 4 more guesses left");
        } else if (count == 2) {
            System.out.println("_____");
            System.out.println("|  |");
            System.out.println("|  0");
            System.out.println("| /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("You have 3 more guesses left");
        } else if (count == 3) {
            System.out.println("_____");
            System.out.println("|  |");
            System.out.println("|  0");
            System.out.println("| /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("You have 2 more guesses left");
        } else if (count == 4) {
            System.out.println("_____");
            System.out.println("|  |");
            System.out.println("|  0");
            System.out.println("| /|)");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("You have one more guess left");
        } else {
            System.out.println("_____");
            System.out.println("|  |");
            System.out.println("|  0");
            System.out.println("| /|)");
            System.out.println("| ()");
            System.out.println("|");
            System.out.println("|");
            System.out.println("You have lost. The word was " + actualWord);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "illusion", "banner", "company", "contact", "linear", "test", "roll", "miracle", "elect"};
        String randomWord = words[random.nextInt(10)];
        char[] lettersCorrect = new char[randomWord.length()];
        int count = 0;
        originalHangman(count, randomWord);
        while (count < 5) {
            if (count == 0) {
                System.out.println("The word is " + randomWord.length() + " letters long.");
            }
            System.out.println("Guess a letter of the word.");
            String letterGuess = input.next().toLowerCase();
            char charLetter = letterGuess.charAt(0);
            if (randomWord.contains(letterGuess)) {
                System.out.println("This letter is in the word. It is the letter in position " + (randomWord.indexOf(letterGuess) + 1));
                lettersCorrect[randomWord.indexOf(charLetter)] = charLetter;
                System.out.println(lettersCorrect);
            } else {
                System.out.println("You guessed wrong.");
                count += 1;
                originalHangman(count, randomWord);
            }
            for (int i = 0; i < randomWord.length(); i++) {
                if((randomWord.indexOf(i))==(lettersCorrect[i])){
                    System.out.println("You have");
                }
            }
        }
    }
}
