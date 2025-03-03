package com.javarush.bekk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String inputText = "C:\\projects\\1\\text.txt";
        String outputText = "C:\\projects\\1\\textEncrypt.txt";
        int key = 2;
        caesarCipher.encrypt(inputText, outputText, key);
    }


}