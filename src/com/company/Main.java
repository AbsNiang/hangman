package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "illusion", "banner", "company", "contact", "linear", "test", "roll", "miracle", "elect"};
        String randomWord = words[random.nextInt(10)];
        System.out.println(randomWord);
        for (int i = 0; i < 5; i++) {

        }
    }
}
