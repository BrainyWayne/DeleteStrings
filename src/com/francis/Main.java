package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        String remove;

        Scanner scanner = new Scanner(System.in);
        printOut("Enter the string s\n");
        s = scanner.nextLine();
        printOut("Enter the characters to remove\n");
        remove = scanner.nextLine();

        printOut(deleteChars(s,remove));



    }

    static String deleteChars(String s, String remove){


        for(int i = 0; i < remove.length(); i++){
           s = s.replaceAll(String.valueOf(remove.charAt(i)), "");

        }




        return s;
    }


    static void printOut(String string){
        System.out.print(string);
    }
}
