package org.example;

import java.util.Scanner;


public class Main {

    public static String contrario(String str) {
        String rts="";
        for (int i=str.length();i>0;i--){
            rts +=Character.toString(str.charAt(i-1));
        }
        return rts;
    }



    public static void main(String[] args) {
        System.out.print("Inserisci una stringa: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(contrario(str));
    }
}