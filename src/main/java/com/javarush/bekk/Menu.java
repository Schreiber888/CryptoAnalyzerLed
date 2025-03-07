package com.javarush.bekk;

public class Menu {
    String sourceFile;
    String targetFile;
    int key;
    int command;
    public static int mode;

    public Menu(String sourceFile, String targetFile, int key, byte command) {
        this.sourceFile = sourceFile;
        this.targetFile = targetFile;
        this.key = key;
        this.command = command;
    }

    public static int resolve(int command) {
        switch (command) {
            case 1:
                mode = 0;
            case 2:
                mode = 1;
            default:
                mode = 3;
        }
        return mode;
    }

}

