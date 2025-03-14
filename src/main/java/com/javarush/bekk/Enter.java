package com.javarush.bekk;

import java.util.Scanner;

public class Enter {
    String inputText;
    String outputTextEncrypt;
    int key;
    int command;


    public static Enter enterForEncrypt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.ENTER_INPUT_FILE);
        String inputText = scanner.nextLine();
        System.out.println(Constant.ENTER_OUTPUT_FILE);
        String outputTextEncrypt = scanner.nextLine();
        System.out.println(Constant.ENTER_KEY);
        int key = scanner.nextInt();
        System.out.println(Constant.ENTER_COMMAND);
        int command = scanner.nextInt();
        return null;
    }


}



