package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int contaLettere=0;
        while (str.length()!=0){
        if ((str.charAt(0)>='A')&&(str.charAt(0)<='Z')) {
                contaLettere+=str.length();
            }
            str = input.nextLine();
        }
        System.out.println(contaLettere);
    }
}