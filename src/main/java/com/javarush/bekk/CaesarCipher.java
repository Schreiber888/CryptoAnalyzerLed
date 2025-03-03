package com.javarush.bekk;

import java.io.*;


public class CaesarCipher {
    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    public void encrypt(String inputFile, String outputFile, int key) {
        // Реализация шифрования
        char[] arrayAlphabet = new char[ALPHABET.length];
        for (int i = 0, j = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabet[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                j = 0;
                arrayAlphabet[i] = ALPHABET[j];
            }
        }
        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {
            //tringTokenizer stringTokenizer = new StringTokenizer()
            /*while (reader.ready()){
                char symbol = (char) reader.read();
                writer.write(symbol);
            }*/
            int value;
            while ((value = reader.read()) > -1) {
                char symbol = (char) value;
                for (int i = 0; i < ALPHABET.length; i++) {
                    char symbolToLower = Character.toLowerCase(symbol);
                    if (symbolToLower == ALPHABET[i]) {
                        //System.out.print(arrayAlphabet[i]);
                        writer.write(arrayAlphabet[i]);
                    } else if (symbolToLower == '\n') {
                        writer.write('\n');
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        /*public void decrypt (String inputFile, String outputFile,int key){
            // Реализация расшифровки
        }*/

}
