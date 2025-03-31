package com.javarush.bekk;

public class Execution {

    public static void run(Enter enter, Encode encode, Decode decode) throws IllegalArgumentException{
        boolean exit = false;
        do {
            Menu menu = new Menu();
            int mode = menu.resolveMode();
            if (mode == 0) {
                enter.enterForEncrypt();
            } else if (mode == 1) {
                enter.enterForDecrypt();
            } else if (mode == 2) {
                exit = true;
            } else {
                throw new IllegalArgumentException("incorrect data input " + (mode + 1));
            }

            Alphabet alphabet = new Alphabet(enter.getKey());
            char[] charsAlphabetForEncrypt = alphabet.alphabetForEncrypt(enter.getKey());
            char[] charsAlphabetForDecrypt = alphabet.alphabetForDecrypt(enter.getKey());

            if (mode == 0) {
                encode.doAction(enter.getInputFileDirAndName(), enter.getOutputFileEncryptDir(), alphabet.ALPHABET, charsAlphabetForEncrypt);
                System.out.println(Constant.COMPLETE_Encrypt);
            } else if (mode == 1) {
                decode.doAction(enter.getInputFileEncryptDirAndName(), enter.getOutputFileDecryptDir(), alphabet.ALPHABET, charsAlphabetForDecrypt);
                System.out.println(Constant.COMPLETE_Decrypt);
            }
        } while (!exit);
    }
}
