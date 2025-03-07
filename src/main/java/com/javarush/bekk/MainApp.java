package com.javarush.bekk;


import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        CaesarCipher caesarCipher = new CaesarCipher();

        String inputText = "I:\\j\\project1\\text.txt";
        String outputTextEncrypt = "I:\\j\\project1\\encryptText.txt";
        String outputTextDecrypt = "I:\\j\\project1\\decryptText.txt";
        int key = 5;
        caesarCipher.encrypt(inputText, outputTextEncrypt, key);
        caesarCipher.decrypt(outputTextEncrypt, outputTextDecrypt, key);
    }


}