package com.javarush.bekk;



public class MainApp {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String inputText = "I:\\j\\project1\\text.txt";
        String outputText = "I:\\j\\project1\\encryptText.txt";
        int key = 2;
        caesarCipher.encrypt(inputText, outputText, key);
    }


}