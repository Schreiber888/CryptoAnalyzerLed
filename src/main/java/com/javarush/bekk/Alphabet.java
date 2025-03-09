package com.javarush.bekk;

public class Alphabet {
    private static int key;

    public Alphabet(int key) {
        Alphabet.key = key;
    }

    public final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' ', '-'};

    public char[] alphabetForEncrypt(int key) {
        char[] arrayAlphabetForEncrypt = new char[ALPHABET.length];
        for (int i = 0, j = 0, k = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabetForEncrypt[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                arrayAlphabetForEncrypt[i] = ALPHABET[k];
                k++;
            }
        }
        return arrayAlphabetForEncrypt;//erty
    }

    public char[] alphabetForDecrypt(int key) {
        char[] arrayAlphabetForEncrypt = new char[ALPHABET.length];
        for (int i = 0, j = 0, k = 0; i < ALPHABET.length; i++, j++) {
            if (j < ALPHABET.length - key) {
                arrayAlphabetForEncrypt[i] = ALPHABET[j + key]; //key сделать ограничение
            } else {
                arrayAlphabetForEncrypt[i] = ALPHABET[k];
                k++;
            }
        }
        return arrayAlphabetForEncrypt;
    }
}
