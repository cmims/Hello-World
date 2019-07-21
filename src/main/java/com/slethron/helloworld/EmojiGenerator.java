package com.slethron.helloworld;

import java.util.Random;

public class EmojiGenerator {
    private static final String EYES = ":;=";
    private static final String SMILES = ")(/|";

    private Random random;

    public EmojiGenerator() {
        random = new Random();
    }

    public String next() {
        return String.valueOf(EYES.charAt(random.nextInt(EYES.length())))
                + SMILES.charAt(random.nextInt(SMILES.length()));
    }
}
