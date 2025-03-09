package com.javarush.bekk;

public class Alphabet {
    private static int key;

    public Alphabet(int key) {
        Alphabet.key = key;
    }

    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    public static char[] alphabetForEncrypt(int key) {
        char[] arrayAlphabet = new char[ALPHABET.length];
        for (int i = 0, j = 0, k = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabet[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                arrayAlphabet[i] = ALPHABET[k];
                k++;
            }
        }
        return arrayAlphabet;//ert
    }

    public static char[] alphabetForDecrypt(int key) {
        char[] arrayAlphabet = new char[ALPHABET.length];
        for (int i = 0, j = 0, k = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabet[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                arrayAlphabet[i] = ALPHABET[k];
                k++;
            }
        }
        return arrayAlphabet;
    }
}
