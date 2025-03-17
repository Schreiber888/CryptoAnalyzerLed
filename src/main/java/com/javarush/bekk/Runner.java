package com.javarush.bekk;


import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Enter enter = new Enter();
        Menu menu = new Menu();
        Encode encode = new Encode();
        Decode decode = new Decode();
        int mode = menu.resolveMode();
        Execution.run(mode, enter, encode, decode);
    }
}

/*Scanner scanner = new Scanner(System.in);
        System.out.println(Constant.DIRECTIVE_FOR_USER);
        String inputText = "D:\\projects\\1\\text.txt";
        System.out.println(Constant.ENTER_OUTPUT_FILE);
        String outputTextEncrypt = "3";
        System.out.println(Constant.);
        String outputTextDecrypt = "D:\\projects\\1\\decryptText.txt";
        int key = 5;
        int command = 2;*/

 /*String inputText = "I:\\j\\project1\\text.txt";
        String outputTextEncrypt = "I:\\j\\project1\\encryptText.txt";
        String outputTextDecrypt = "I:\\j\\project1\\decryptText.txt";*/