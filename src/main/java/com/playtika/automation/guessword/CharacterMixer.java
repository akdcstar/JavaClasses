package com.playtika.automation.guessword;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterMixer {
    public String mix (String word){
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++){
            int index = ThreadLocalRandom.current().nextInt(characters.length);
            swap(characters, i, index);
        }
        return new String(characters);

    }
    private void swap (char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
