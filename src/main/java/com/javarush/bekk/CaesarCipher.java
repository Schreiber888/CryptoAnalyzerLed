package com.javarush.bekk;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class CaesarCipher implements Action{
    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    public void encrypt(String inputFile, String outputFile, int key) throws IOException {
        // Реализация шифрования
        char[] arrayAlphabet = new char[ALPHABET.length];
        for (int i = 0, j = 0, k = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabet[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                arrayAlphabet[i] = ALPHABET[k];
                k++;
            }
        }
        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputFile))) {
            int value;
            while ((value = reader.read()) > -1) {
                char symbol = (char) value;
                for (int i = 0; i < ALPHABET.length; i++) {
                    char symbolToLower = Character.toLowerCase(symbol);
                    if (symbolToLower == ALPHABET[i]) {
                        //System.out.print(arrayAlphabet[i]);
                        writer.write(arrayAlphabet[i]);

                    } else if (symbol == '\n') {
                        writer.write('\n');
                        i = ALPHABET.length;
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void decrypt(String inputFile, String outputFile, int key) {
        // Реализация расшифровки
        char[] arrayAlphabet = new char[ALPHABET.length];
        for (int i = 0, j = 0, k = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabet[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                arrayAlphabet[i] = ALPHABET[k];
                k++;
            }
        }
        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputFile))) {
            int value;
            while ((value = reader.read()) > -1) {
                char symbol = (char) value;
                for (int i = 0; i < ALPHABET.length; i++) {
                    char symbolToLower = Character.toLowerCase(symbol);
                    if (symbolToLower == arrayAlphabet[i]) {
                        //System.out.print(arrayAlphabet[i]);
                        writer.write(ALPHABET[i]);

                    } else if (symbol == '\n') {
                        writer.write('\n');
                        i = arrayAlphabet.length;
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}