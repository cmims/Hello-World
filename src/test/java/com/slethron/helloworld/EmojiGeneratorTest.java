package com.slethron.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmojiGeneratorTest {

    private EmojiGenerator generator;

    @Before
    public void instantiateEmojiGenerator() {
        generator = new EmojiGenerator();
    }

    @Test
    public void everyGeneratedEmojiHasOnlyEyesAndMouth() {
        String emoji = generator.next();
        assertEquals(emoji.length(), 2);
        assertTrue(":;=".contains(String.valueOf(emoji.charAt(0))));
        assertTrue(")(/|".contains(String.valueOf(emoji.charAt(1))));
    }
}
