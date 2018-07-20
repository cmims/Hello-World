package com.slethron.helloworld;

import com.slethron.emoji.EmojiGenerator;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HelloWorld {
    private EmojiGenerator emojiGenerator;

    private HelloWorld() {
        emojiGenerator = new EmojiGenerator();
    }

    private void say() {
        System.out.println("Hello, World! "
                + emojiGenerator.next()
                + " Today's date is "
                + ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT)
                + ".");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        Scanner in = new Scanner(System.in);
        do {
            helloWorld.say();
        } while (!in.nextLine().equalsIgnoreCase("q"));
    }
}
