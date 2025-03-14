package com.javarush.bekk;


import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Enter.enterForEncrypt();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.DIRECTIVE_FOR_USER);
        String inputText = "D:\\projects\\1\\text.txt";
        System.out.println(Constant.ENTER_OUTPUT_FILE);
        String outputTextEncrypt = "D:\\projects\\1\\encryptText.txt";
        System.out.println(Constant.);
        String outputTextDecrypt = "D:\\projects\\1\\decryptText.txt";
        int key = 5;
        int command = 2;*/
        Alphabet alphabet = new Alphabet(Enter.getKey());
        char[] charsAlphabetForEncrypt = alphabet.alphabetForEncrypt(Enter.getKey());
        char[] charsAlphabetForDecrypt = alphabet.alphabetForDecrypt(Enter.getKey());
        Menu menu = new Menu();
        int mode = menu.resolveMode(Enter.getCommand());
        Encode encode = new Encode();
        Decode decode = new Decode();
        boolean done = false;

        do {
            if (mode == 0) {
                encode.doAction(Enter.getInputFile(), outputTextEncrypt, alphabet.ALPHABET, charsAlphabetForEncrypt);
                done = true;

            } else if (mode == 1) {
                decode.doAction(outputTextEncrypt, outputTextDecrypt, alphabet.ALPHABET, charsAlphabetForDecrypt);
                done = true;
            } else {
                System.out.println("This version of the program has two functions implemented");
            }
        } while (!done);
    }
}
 /*String inputText = "I:\\j\\project1\\text.txt";
        String outputTextEncrypt = "I:\\j\\project1\\encryptText.txt";
        String outputTextDecrypt = "I:\\j\\project1\\decryptText.txt";*/