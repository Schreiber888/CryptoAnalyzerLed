package com.javarush.bekk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Encode implements Action{
    @Override
    public void doAction(String inputFile, String outputFile, char[] ALPHABET, char[] arrayAlphabetForEncrypt) {
        try (
                BufferedReader reader = Files.newBufferedReader(Path.of(inputFile));
                BufferedWriter writer = Files.newBufferedWriter(Path.of(outputFile))) {
            int value;
            while ((value = reader.read()) > -1) {
                char symbol = (char) value;
                for (int i = 0; i < ALPHABET.length; i++) {
                    char symbolToLower = Character.toLowerCase(symbol);
                    if (symbolToLower == ALPHABET[i]) {
                        //System.out.print(arrayAlphabet[i]);
                        writer.write(arrayAlphabetForEncrypt[i]);
                    } else if (symbol == '\n') {
                        writer.write('\n');
                        i = ALPHABET.length;//rt
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
