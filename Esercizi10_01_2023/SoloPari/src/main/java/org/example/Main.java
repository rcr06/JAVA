package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();
        int[] array = new int[n];
        int somma = 0;
        System.out.println("Inserisci numeri: ");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
            somma+=array[i];
        }
        System.out.println("somma: "+somma);
    }
}