package com.javarush.bekk;

import java.util.Scanner;

public class Menu extends Enter{
    int command;
    public int mode;

    public int getMode() {
        return mode;
    }

    public int resolveMode() {
        System.out.println(Constant.ENTER_COMMAND);
        Scanner scanner = new Scanner(System.in);
        String commandString = scanner.nextLine();
        command = Integer.parseInt(commandString);
        switch (command) {
                case 1:
                    mode = 0;
                    Menu.super.enterForEncrypt(); break;
                case 2:
                    mode = 1; break;
                default:
                    mode = 2;
            }
            return mode;
    }
}

