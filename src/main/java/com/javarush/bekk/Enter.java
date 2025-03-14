package com.javarush.bekk;

import java.util.Scanner;

public class Enter {
    private static String inputText;
    private static String outputTextEncrypt;
    private static int key;
    private static int command;

    public static String getInputText() {
        return inputText;
    }

    public static String getOutputTextEncrypt() {
        return outputTextEncrypt;
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
        inputText = scanner.nextLine();
        System.out.println(Constant.ENTER_OUTPUT_FILE);
        outputTextEncrypt = scanner.nextLine();
        System.out.println(Constant.ENTER_KEY);
        key = scanner.nextInt();
        System.out.println(Constant.ENTER_COMMAND);
        command = scanner.nextInt();
    }





}



