package com.javarush.bekk;

import java.util.Scanner;

public class Enter {
    private String inputFileDirAndName;
    private String outputFileEncryptDir;
    private int key;
    private String inputFileEncryptDirAndName;
    private String outputFileDecryptDir;

    public String getInputFileDirAndName() {
        return inputFileDirAndName;
    }

    public String getOutputFileEncryptDir() {
        return outputFileEncryptDir;
    }

    public int getKey() {
        return key;
    }

    public String getInputFileEncryptDirAndName() {
        return inputFileEncryptDirAndName;
    }

    public String getOutputFileDecryptDir() {
        return outputFileDecryptDir;
    }

    public void enterForEncrypt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.ENTER_INPUT_FILE);
        inputFileDirAndName = scanner.nextLine();
        System.out.println(Constant.ENTER_OUTPUT_FILE_ENCRYPT);
        outputFileEncryptDir = scanner.nextLine();
        int key = extracted(scanner);
        while (key < 0 || key > 43) {
            System.out.println(Constant.ENTER_KEY_ERROR);
            key = extracted(scanner);
        }
    }

    private int extracted(Scanner scanner) {
        System.out.println(Constant.ENTER_KEY);
        String keyString = scanner.nextLine();
        return key = Integer.parseInt(keyString);
    }

    public void enterForDecrypt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.ENTER_INPUT_FILE_FOR_DECRYPT);
        inputFileEncryptDirAndName = scanner.nextLine();
        System.out.println(Constant.ENTER_OUTPUT_FILE_DECRYPT);
        outputFileDecryptDir = scanner.nextLine();
        int key = extracted(scanner);
        while (key < 0 || key > 43) {
            System.out.println(Constant.ENTER_KEY_ERROR);
            key = extracted(scanner);
        }
    }
}



