package org.example;

import java.util.Scanner;

public class Main {

    public static boolean cercaElemento(int[] array, int num){
        boolean trovato = false;
        for (int i=0; i< array.length; i++) {
            if (num == array[i]) {
                trovato = true;
            }
        }
        return trovato;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Numero da cercare: ");
        int num = input.nextInt();

        System.out.print("Quanti numeri nell'array? ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Inserisci numeri:");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }

        int[] vettore = {1,2,3,4,5};


        boolean trovato = cercaElemento(array, num);
        System.out.println("Elemento trovato? "+ trovato);

    }
}