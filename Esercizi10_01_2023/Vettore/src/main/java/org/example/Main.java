package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Quanti numeri vuoi inserire? ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] vettore = new int[n];
        int somma =0;
        double media=0;
        System.out.print("Inserisci numeri: ");
        for (int i=0; i<n; i++){
            vettore[i] = input.nextInt();
            somma+=vettore[i];
        }
        media =somma/n;
        System.out.println("somma: "+ somma +"; media: "+ media);
    }
}