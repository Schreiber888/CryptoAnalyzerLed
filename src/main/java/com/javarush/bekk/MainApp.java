package com.javarush.bekk;


import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inputText = "C:\\projects\\1\\text.txt";
        String outputTextEncrypt = "C:\\projects\\1\\encryptText.txt";
        String outputTextDecrypt = "C:\\projects\\1\\decryptText.txt";
        /*String inputText = "I:\\j\\project1\\text.txt";
        String outputTextEncrypt = "I:\\j\\project1\\encryptText.txt";
        String outputTextDecrypt = "I:\\j\\project1\\decryptText.txt";*/
        int key = 5;
        int command = 0;
        Alphabet alphabet = new Alphabet(key);
        char[] charsAlphabetForEncrypt = alphabet.alphabetForEncrypt(key);
        char[] charsAlphabetForDecrypt = alphabet.alphabetForDecrypt(key);
        Menu menu = new Menu();
        int i = menu.resolveMode(command);
        Encode encode = new Encode();
        Decode decode = new Decode();
        /*if (menu.resolveMode(command) == 1) {*/
            encode.doAction(inputText, outputTextEncrypt, alphabet.ALPHABET, charsAlphabetForEncrypt);
        /*} else if (menu.resolveMode(command) == 2) {*/
            decode.doAction(outputTextEncrypt, outputTextDecrypt, alphabet.ALPHABET, charsAlphabetForDecrypt);
        //}
    }
}