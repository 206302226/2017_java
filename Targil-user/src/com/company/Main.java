package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // write your code here


        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter num:");

        System.out.println("pleae enter 1 to Signup");
        System.out.println("pleae enter 2 to login");
        System.out.println("pleae enter 3 to logout");
        System.out.println("pleae enter 4 to reverse");
        System.out.println("pleae enter 5 to exit");

        try {
            //String name = bufferedReader.readLine();
            //System.out.println("your name is: " + name);
            String ageAsString = bufferedReader.readLine();
            int choose = Integer.valueOf(ageAsString);

            switch (choose)
            {
                case 1:

                    break;








            }




        } catch (IOException e) {
            System.out.println("error reading...");
        }catch (NumberFormatException exception){
            System.out.println("must enter an integer");
        }


        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}