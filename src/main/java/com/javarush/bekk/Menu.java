package com.javarush.bekk;

public class Menu {
    int command;
    public static int mode;
    public int resolveMode(int command) {
        switch (command) {
            case 1:
                mode = 0;
            case 2:
                mode = 1;
            default:
                mode = 2;
        }
        return mode;
    }

}

