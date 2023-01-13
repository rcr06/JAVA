package org.example;

import java.util.Scanner;

public class Main {

    public static int cercaElemento(int[] array, int num){
        int trovato = 0;
        for (int i=0; i< array.length; i++) {
            if (num == array[i]) {
                trovato++;
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

            int trovato = cercaElemento(array, num);
            System.out.println("Elemento trovato quante volte? "+ trovato);
    }
}