package org.example;

import java.util.Scanner;

public class Main {

    public static int sommaInteri(int[] array, int n){
        int somma = 0;
        for (int i=0; i<n; i++){
            somma += array[i];
        }
        return somma;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri? ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Inserisci numeri:");
        for (int i=0; i<n; i++) {
            System.out.print("posizione array: " + i + ": ");
            array[i] = input.nextInt();
        }

        int tot = sommaInteri(array, n);
        System.out.println("La loro somma è: "+ tot);
    }
}