package com.javarush.bekk;

public class Execution {
    public static void run(int mode, Enter enter, Encode encode, Decode decode) {
            if (mode == 0) {
                enter.enterForEncrypt();
            } else if (mode == 1) {
                enter.enterForDecrypt();
            } else  {
                throw new IllegalArgumentException("incorrect data input " + mode);
            }

            Alphabet alphabet = new Alphabet(enter.getKey());
            char[] charsAlphabetForEncrypt = alphabet.alphabetForEncrypt(enter.getKey());
            char[] charsAlphabetForDecrypt = alphabet.alphabetForDecrypt(enter.getKey());


            boolean done = false;

            do {
                if (mode == 0) {
                    encode.doAction(enter.getInputFileDirAndName(), enter.getOutputFileEncryptDir(), alphabet.ALPHABET, charsAlphabetForEncrypt);
                    done = true;

                } else if (mode == 1) {
                    decode.doAction(enter.getInputFileEncryptDirAndName(), enter.getOutputFileDecryptDir(), alphabet.ALPHABET, charsAlphabetForDecrypt);
                    done = true;
                } else {
                    System.out.println("This version of the program has two functions implemented");
                }
            } while (!done);
    }
}
