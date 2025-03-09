package com.javarush.bekk;

import java.util.Scanner;

public class Enter{
    String sourceFile;
    String targetFile;
    int key;
    int command;
    public static int mode;

    public Enter(String sourceFile, String targetFile, int key, int command, Scanner scanner) {
        this.sourceFile = sourceFile;
        this.targetFile = targetFile;
        this.key = key;
        this.command = command;
        this.scanner = scanner;
    }

    Scanner scanner = new Scanner(System.in);


}
