package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/28/2017.
 */
public class Menu {

    public  void printMenu() {

      //  System.out.println();
        System.out.println("please choose:");
        System.out.println("1.decipher");
        System.out.println("2.encode");
        System.out.println("your choice:");
        String inputchoise1 = readInput();

        if (inputchoise1.length() != 0) {
            switch (inputchoise1) {
                case "1":
                    decryption();
                    break;
                case "2":
                    encryption();
                    break;
                case "0":
                    System.out.println("bye bye.");
                    return;
                default:
                    System.out.println("invalid option. try again.");
            }
        }

        printMenu();
    }

    public myFile getpath()
    {
        System.out.println("please enter mypath");
        String path =  readInput();
        myFile file=new myFile(path);

        try {
            file.checkfile();
        }
        catch (InvalidParameterException e) {

            System.out.println(e);
            getpath();

        }

        return file;
    }

    public  void encryption()
    {

        myFile file=getpath();
        Encryption.encryption(file);

    }

    public  void decryption()
    {

        myFile file=getpath();
        Decryption.decryption(file);

    }

    public  String readInput(){
        String input = null;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }


}
