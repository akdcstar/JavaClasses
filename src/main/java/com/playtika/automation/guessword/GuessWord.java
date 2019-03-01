package com.playtika.automation.guessword;

import java.util.Scanner;

public class GuessWord {
    private final WordSource wordSource = new WordSource();
    private final CharacterMixer characterMixer = new CharacterMixer();

    public static void main(String[] args) {

        GuessWord guessWord = new GuessWord();
        guessWord.playGame();
    }

    public void playGame() {
        Scanner console = new Scanner(System.in);
        String word = wordSource.getWord();
        System.out.printf("Please, guess the word: %s %n", characterMixer.mix(word));

        String userWord = console.nextLine();
        while (true) {

            if (word.equalsIgnoreCase(userWord)) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Incorrect");
                System.out.println("try again");
                userWord = console.nextLine();
            }

        }
    }
}
