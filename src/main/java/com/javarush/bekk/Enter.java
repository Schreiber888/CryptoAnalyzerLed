package com.javarush.bekk;

import java.util.Scanner;

public class Enter {
    private static String inputFile;
    private static String outputFileEncrypt;
    private static int key;
    private static int command;

    public static String getInputFile() {
        return inputFile;
    }

    public static String getOutputFileEncrypt() {
        return outputFileEncrypt;
    }

    public static int getKey() {
        return key;
    }

    public static int getCommand() {
        return command;
    }

    public static void enterForEncrypt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.ENTER_INPUT_FILE);
        inputFile = scanner.nextLine();
        System.out.println(Constant.ENTER_OUTPUT_FILE_ENCRYPT);
        outputFileEncrypt = scanner.nextLine();
        System.out.println(Constant.ENTER_KEY);
        key = scanner.nextInt(); //не хорошо. Надо везде использовать nextLine
        System.out.println(Constant.ENTER_COMMAND);
        command = scanner.nextInt();
    }

    public static void enterForDecrypt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.ENTER_INPUT_FILE_FOR_DECRYPT);
        inputFile = scanner.nextLine();
        System.out.println(Constant.ENTER_OUTPUT_FILE_DECRYPT);
        outputFileEncrypt = scanner.nextLine();
        System.out.println(Constant.ENTER_KEY);
        key = scanner.nextInt(); //не хорошо. Надо везде использовать nextLine
        System.out.println(Constant.ENTER_COMMAND);
        command = scanner.nextInt();
    }



}



