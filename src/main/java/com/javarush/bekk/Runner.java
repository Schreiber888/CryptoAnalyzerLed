package com.javarush.bekk;


import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inputText = "D:\\projects\\1\\text.txt";
        String outputTextEncrypt = "D:\\projects\\1\\encryptText.txt";
        String outputTextDecrypt = "D:\\projects\\1\\decryptText.txt";
        /*String inputText = "I:\\j\\project1\\text.txt";
        String outputTextEncrypt = "I:\\j\\project1\\encryptText.txt";
        String outputTextDecrypt = "I:\\j\\project1\\decryptText.txt";*/
        int key = 5;
        int command = 2;
        Alphabet alphabet = new Alphabet(key);
        char[] charsAlphabetForEncrypt = alphabet.alphabetForEncrypt(key);
        char[] charsAlphabetForDecrypt = alphabet.alphabetForDecrypt(key);
        Menu menu = new Menu();
        int i = menu.resolveMode(command);
        Encode encode = new Encode();
        Decode decode = new Decode();
        boolean done = false;

        do {
            if (i == 0) {
                encode.doAction(inputText, outputTextEncrypt, alphabet.ALPHABET, charsAlphabetForEncrypt);
                done = true;

            } else if (i == 1) {
                decode.doAction(outputTextEncrypt, outputTextDecrypt, alphabet.ALPHABET, charsAlphabetForDecrypt);
                done = true;
            } else {
                System.out.println("This version of the program has two functions implemented");
            }
        } while (!done);
    }
}