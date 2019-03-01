package com.playtika.automation.guessword;

import java.util.concurrent.ThreadLocalRandom;

public class WordSource {
    private static final String[] WORDS = {
            "animal",
            "planet",
            "discovery",
            "earth",
            "ocean"
    };

    public String getWord() {
        int index = ThreadLocalRandom.current().nextInt(WORDS.length);
        return WORDS[index];
    }
}
