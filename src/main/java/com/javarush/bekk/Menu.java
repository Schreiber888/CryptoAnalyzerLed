package com.javarush.bekk;

import java.util.Scanner;

public class Menu extends Enter {
    public int command;
    public int mode;

    public int getCommand() {
        return command;
    }

    public int resolveMode() {
        System.out.println(Constant.ENTER_COMMAND);
        Scanner scanner = new Scanner(System.in);
        String commandString = scanner.nextLine();
        command = Integer.parseInt(commandString);
        switch (command) {
            case 1:
                mode = 0;
                break;
            case 2:
                mode = 1;
                break;
            case 3:
                mode = 2;
                break;
            default:
                mode = 3;
        }
        return mode;
    }
}

