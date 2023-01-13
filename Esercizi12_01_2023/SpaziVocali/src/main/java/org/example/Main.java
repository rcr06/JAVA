package org.example;

import java.util.Scanner;

public class Main {



    public static int spazioVocali(String str){
        int n=0;
        for (int i=0;i<str.length();i++){
            if (i!=0) {
                if ((str.charAt(i) == 'A' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'E' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'I' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'O' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'U' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'a' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'e' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'i' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'o' && str.charAt(i - 1) == ' ') ||
                        (str.charAt(i) == 'u' && str.charAt(i - 1) == ' ')) {
                    n++;
                }
            }
            }

        return n;
    }

    public static void main(String[] args) {
        System.out.print("Inserisci una stringa: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(spazioVocali(str));

    }
}