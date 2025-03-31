package com.javarush.bekk;


import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Enter enter = new Enter();  //Далеко не все иключения отработал...
        Encode encode = new Encode();
        Decode decode = new Decode();
        try {
            Execution.run(enter, encode, decode);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            Execution.run(enter, encode, decode);
        }
    }
}
