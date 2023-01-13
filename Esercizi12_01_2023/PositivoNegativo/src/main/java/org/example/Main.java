package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String trovato="NO";
        System.out.println("inserisci numeri: ");
        int past=input.nextInt();
        for (int i = 1; i >0; i++) {
            int n=input.nextInt();
            if (n!=0) {
                if (past > 0 && n < 0) {
                    trovato = "OK";
                }
                past = n;
            }else{
                break;
            }
        }
        System.out.println(trovato);
    }
}