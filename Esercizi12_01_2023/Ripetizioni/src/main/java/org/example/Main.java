package org.example;

import java.util.Scanner;

public class Main {

    public static void stampa(char c){
        System.out.println(c);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti caratteri da inserire? ");
        int n =input.nextInt();
        input.nextLine();
        for (int j=0; j<5;j++){
            System.out.println("Giro "+ (j+1)+":");
            for (int i=0; i<n; i++){
                System.out.println("Inserisci carattere numero "+(i+1)+":");
                String c = input.nextLine();
                stampa(c.charAt(0));
             }
            }
        }

    }
